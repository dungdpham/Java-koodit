import java.util.ArrayList;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("Petrol", "Red");
        Vehicle motorcycle = new Motorcycle("Gasoline", "Black");
        Vehicle bus = new Bus("Diesel", 40);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(motorcycle);
        vehicles.add(bus);

        System.out.println("Vehicle Demonstration\n");
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();
            System.out.println(vehicle.getInfo() + "\n");
        }
    }
}
