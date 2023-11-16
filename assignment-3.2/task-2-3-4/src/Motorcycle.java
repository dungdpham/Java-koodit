public class Motorcycle extends AbstractVehicle {
    private String color;

    public Motorcycle(String fuel, String color, double fuelEfficiency) {
        super("Motorcycle", fuel, fuelEfficiency);
        this.color = color;
    }

    @Override
    public String getAdditionalInfo() {
        return "Color: " + color;
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
