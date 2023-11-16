import java.util.ArrayList;

public class VehicleDemo {
    public static void main(String[] args) {
        AbstractVehicle car = new Car("Petrol", "Red", 0.04);
        AbstractVehicle motorcycle = new Motorcycle("Gasoline", "Black", 0.01);
        AbstractVehicle bus = new Bus("Diesel", 40, 0.06);
        AbstractVehicle eCar = new ElectricCar(100, 0.15);
        AbstractVehicle eBike = new ElectricMotorcycle(40, 0.03);

        ArrayList<AbstractVehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(motorcycle);
        vehicles.add(bus);
        vehicles.add(eCar);
        vehicles.add(eBike);

        System.out.println("Vehicle Demonstration\n");
        for (AbstractVehicle vehicle : vehicles) {
            vehicle.start();
            vehicle.stop();
            System.out.println(vehicle.getInfo());
            System.out.println(vehicle.getAdditionalInfo());
            vehicle.charge();
            System.out.println(vehicle.calculateFuelEfficiency());
            System.out.println();
        }
    }
}
