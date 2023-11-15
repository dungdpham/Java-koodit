public class Bus extends Car {
    private int passengerOnboard;

    public Bus(String typeName) {
        super(typeName);
        passengerOnboard = 0;
    }

    public int getPassengerOnboard() {
        return passengerOnboard;
    }

    public void passengerEnter() {
        passengerOnboard = Math.min(passengerOnboard + 1, 40);
    }

    public void passengerExit() {
        passengerOnboard = Math.max(0, passengerOnboard - 1);
    }
}
