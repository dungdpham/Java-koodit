public class NumberPrinter implements Runnable {
    private int counter, range;
    private String type;

    public NumberPrinter(String type, int range) {
        this.type = type;
        this.range = range;
        if (type.equalsIgnoreCase("odd")) {
            counter = 1;
        } else if (type.equalsIgnoreCase("even")) {
            counter = 2;
        }
    }

    @Override
    public void run() {
        try{
            while (counter <= range) {
                System.out.println(type + " Thread: " + counter);
                counter += 2;
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {
        Thread odd = new Thread(new NumberPrinter("Odd", 30));
        Thread even = new Thread(new NumberPrinter("Even", 30));

        odd.start(); even.start();

        try {
            odd.join(); even.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Printing complete.");
    }
}
