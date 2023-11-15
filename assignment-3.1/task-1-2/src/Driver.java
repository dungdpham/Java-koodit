public class Driver {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        for (int i = 0; i < 4; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h, gasoline level: " + myCar.getGasolineLevel());
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h, gasoline level: " + myCar.getGasolineLevel());
        }

        System.out.println();

        SportsCar sportsCar = new SportsCar("Porsche 911");
        sportsCar.fillTank();

        for (int i = 0; i < 3; i++) {
            sportsCar.accelerate();
            System.out.println(sportsCar.getTypeName() + ": speed is " + sportsCar.getSpeed() + " km/h, gasoline level: " + sportsCar.getGasolineLevel());
        }

        System.out.println();

        Bus bus = new Bus("MAN R40");
        bus.fillTank();

        for (int i = 0; i < 20; i++) {
            bus.passengerEnter();
        }

        System.out.println(bus.getTypeName() + ": number of passengers onboard: " + bus.getPassengerOnboard());
        bus.accelerate();
        System.out.println(bus.getTypeName() + ": speed is " + bus.getSpeed() + " km/h, gasoline level: " + bus.getGasolineLevel());
    }
}
