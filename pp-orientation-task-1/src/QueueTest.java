import java.util.LinkedList;
import java.util.Scanner;

public class QueueTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<Customer> queue = new LinkedList<>();

        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Customer enters the queue.");
            System.out.println("2. Customer exits the queue.");
            System.out.println("3. Close the queue test.");
            System.out.print("Select: ");

            int option = scanner.nextInt();

            if (option == 1) {
                Customer enterCustomer = new Customer();

                queue.addFirst(enterCustomer);
                enterCustomer.setStartTime(System.currentTimeMillis());

                System.out.println("\nCustomer " + enterCustomer.getId() + " entered the queue!");
            } else if (option == 2) {
                if (queue.isEmpty()) {
                    System.out.println("\nThe queue is empty!");
                } else {
                    Customer exitCustomer = queue.removeLast();

                    exitCustomer.setEndTime(System.currentTimeMillis());

                    System.out.print("\nCustomer " + exitCustomer.getId() + " exited the queue! ");
                    System.out.println("Time in queue: " + exitCustomer.duration() + " ms.");
                }
            } else if (option == 3) {
                System.out.println("\nTest closed!");
                break;
            } else {
                System.out.println("\nInvalid choice!");
            }
        }
    }
}
