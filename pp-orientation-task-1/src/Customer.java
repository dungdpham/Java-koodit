public class Customer {
    private int id;
    private long startTime;
    private long endTime;
    private static int _id;

    public Customer() {
        _id++;
        id = _id;
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long duration() {
        return endTime - startTime;
    }

    public String toString() {
        return "Customer " + id + ": Response time " + duration() + " ms. ";
    }

    public void resetId() {
        _id = 0;
    }

    public static void main(String[] args) {
        System.out.println("Customer class tester!");

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();

        customer1.setStartTime(System.currentTimeMillis());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        customer1.setEndTime(System.currentTimeMillis());
        System.out.println(customer1);

        customer2.setStartTime(System.currentTimeMillis());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}
        customer2.setEndTime(System.currentTimeMillis());
        System.out.println(customer2);

        System.out.println(customer3);
    }
}
