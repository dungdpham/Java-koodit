public class CarDriver {

    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla", 100, 400);
        myCar.fillTank();

        for(int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while(myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        myCar.setCruiseControlSpeed(85);

        for (int i = 0; i < 4; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        myCar.turnOnCruiseControl();
        System.out.println("Cruise Control on? " + myCar.isCruiseControlOn());

        myCar.turnOffCruiseControl();
        System.out.println("Cruise Control on? " + myCar.isCruiseControlOn());
    }
}