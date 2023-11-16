public class Bus extends AbstractVehicle {
    private int capacity;

    public Bus(String fuel, int capacity, double fuelEfficiency) {
        super("Bus", fuel, fuelEfficiency);
        this.capacity = capacity;
    }

    @Override
    public String getAdditionalInfo() {
        return "Capacity: " + capacity + " passenger";
    }

    @Override
    public void charge() {
        System.out.println(getType() + ": Not possible to charge");
    }

    @Override
    public String calculateFuelEfficiency() {
        return super.calculateFuelEfficiency() + " l/km";
    }
}
