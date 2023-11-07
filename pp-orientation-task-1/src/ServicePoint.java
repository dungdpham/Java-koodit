import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue;
    private int customerServiced;
    private long serviceTimeSum;

    public ServicePoint() {
        queue = new LinkedList<>();
        customerServiced = 0;
        serviceTimeSum = 0;
    }

    public void addToQueue(Customer a) {
        a.setStartTime(System.currentTimeMillis());
        queue.addFirst(a);
    }

    private Customer removeFromQueue() {
        if (!queue.isEmpty()) {
            return queue.removeLast();
        } else {
            return null;
        }
    }

    public void serve() {
        Customer a;
        long startServiceTime, endServiceTime, serviceTime;

        a = removeFromQueue();

        while (a != null) {
            // serve the customer
            startServiceTime = System.currentTimeMillis();
            try {
                Thread.sleep(Math.round(Math.random()*9000+1000));
            } catch (InterruptedException e) {}

            // customer served
            endServiceTime = System.currentTimeMillis();
            a.setEndTime(endServiceTime);

            serviceTime = endServiceTime - startServiceTime;

            customerServiced++;
            serviceTimeSum += serviceTime;

            System.out.println(a + "Service time: " + serviceTime + " ms.");

            a = removeFromQueue();
        }
    }

    public double avgServiceTime() {
        if (customerServiced != 0)
            return (double) serviceTimeSum/customerServiced;
        else
            return 0.0;
    }

    public static void main(String[] args) {
        ServicePoint queue = new ServicePoint();

        for (int i = 0; i < 5; i++){
            queue.addToQueue(new Customer());
        }

//        try {
//            Thread.sleep(Math.round(Math.random()*9000+1000));
//        } catch (InterruptedException e) {}

        queue.serve();

        System.out.println("Average service time: " + queue.avgServiceTime() + " ms.");
    }
}
