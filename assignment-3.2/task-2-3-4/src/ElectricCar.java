public class ElectricCar extends AbstractVehicle {
    private int batteryCapacity;
    private int batteryLevel;

    public ElectricCar(int batteryCapacity, double fuelEfficiency) {
        super("Electric Car", "Electricity", fuelEfficiency);
        this.batteryCapacity = batteryCapacity;
        batteryLevel = 0;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void charge() {
        batteryLevel = batteryCapacity;
        System.out.println(getType() + ": fully charged. Battery level: " + getBatteryLevel() + " kWh");
    }

    public String getAdditionalInfo() {
        return "Battery Capacity: " + getBatteryCapacity() + " kWh";
    }

    @Override
    public String calculateFuelEfficiency() {
        return super.calculateFuelEfficiency() + " kWh/km";
    }
}
