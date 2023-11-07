import java.util.Random;

public class MainTest {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();

        Random random = new Random();

        System.out.println("Basic Queue/ServicePoint simulator");

        for (int i = 0; i < 5; i++) {
            System.out.println("\nTest run " + (i + 1) + ": ");

            new CustomerGenerator(servicePoint, random.nextInt(1, 11));
            servicePoint.serve();

            System.out.printf("Average service time: %.2f ms.\n", servicePoint.avgServiceTime());

            new Customer().resetId();
        }
    }
}
