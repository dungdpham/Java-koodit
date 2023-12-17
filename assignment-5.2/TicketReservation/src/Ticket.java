public class Ticket {
    private int amount;

    public Ticket(int amount) {
        this.amount = amount;
    }

    public synchronized boolean reserve(int reserveAmount) {
        int result = amount - reserveAmount;

        if (result < 0) {
            return false;
        } else {
            amount = result;
            return true;
        }
    }

    public int getAmount() {
        return amount;
    }
}
