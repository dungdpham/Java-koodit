public class Customer implements Runnable {
    private Ticket ticket;
    private int reserveAmount, id;
    private static int customerCount;

    public Customer(Ticket ticket, int reserveAmount) {
        this.ticket = ticket;
        this.reserveAmount = reserveAmount;
        customerCount++;
        id = customerCount;
    }

    public int getId() {
        return id;
    }

    public int getReserveAmount() {
        return reserveAmount;
    }

    @Override
    public void run() {
        boolean result = ticket.reserve(reserveAmount);
        if (result) {
            System.out.println("Customer " + getId() + " reserved " + getReserveAmount() + " tickets.");
        } else {
            System.out.println("Customer " + getId() + " couldn't reserve " + getReserveAmount() + " tickets.");
        }
    }
}
