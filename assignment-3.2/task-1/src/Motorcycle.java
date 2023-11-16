public class Motorcycle implements Vehicle {
    private final String type = "Motorcycle";
    private String fuel;
    private String color;

    public Motorcycle(String fuel, String color) {
        this.fuel = fuel;
        this.color = color;
    }
    @Override
    public void start() {
        System.out.println(type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }

    @Override
    public String getInfo() {
        return type + " Information:\nType: " + type +"\nFuel: " + fuel + "\nColor: " + color;
    }
}
