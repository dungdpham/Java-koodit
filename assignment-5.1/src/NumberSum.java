public class NumberSum extends Thread {
    private int[] numbers;
    private int start, end;
    private int sum;

    public NumberSum(int[] numbers, int start, int end) {
        this.numbers =  numbers;
        this.start = start;
        this.end = end;
        sum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <=end; i++) {
            sum += numbers[i];

            Thread.yield();
        }
    }

    public int getSum() {
        return sum;
    }
}
