public class Bus implements Vehicle{
    private final String type = "Bus";
    private String fuel;
    private int capacity;

    public Bus(String fuel, int capacity) {
        this.fuel = fuel;
        this.capacity = capacity;
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
        return type + " Information:\nType: " + type +"\nFuel: " + fuel + "\nCapacity: " + capacity + " passengers";
    }
}
