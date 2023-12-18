import java.util.Random;

public class Main {
    private static final int TICKET_AMOUNT = 30;
    private static final int RESERVE_MAX = 2;
    private static final int CUSTOMER_AMOUNT = 50;

    public static void main(String[] args) {
        Ticket concert = new Ticket(TICKET_AMOUNT);
        Thread[] threads = new Thread[CUSTOMER_AMOUNT];

        Random random = new Random();
        for (int i = 0; i < CUSTOMER_AMOUNT; i++) {
            threads[i] = new Thread(new Customer(concert, random.nextInt(1, RESERVE_MAX + 1)));
            //threads[i].start();
        }

//        for (int i = 0; i < CUSTOMER_AMOUNT; i++) {
//            threads[i].start();
//        }

        for (Thread thread : threads) {
            thread.start();
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Remaining " + concert.getAmount() + " tickets.");
    }
}
