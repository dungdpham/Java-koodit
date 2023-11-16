abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    private String type;
    private String fuel;
    private double fuelEfficiency;

    public AbstractVehicle(String type, String fuel, double fuelEfficiency) {
        this.type = type;
        this.fuel = fuel;
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public void start() {
        System.out.println(getType() + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(getType() + " is stopping...");
    }

    @Override
    public String getInfo() {
        return getType() + " Information:\n" + "Type: " + getType() + "\nFuel: " + getFuel();
    }

    public abstract String getAdditionalInfo();

    @Override
    public String calculateFuelEfficiency() {
        return getType() + ": Fuel Efficiency: " + getFuelEfficiency();
    }
}
