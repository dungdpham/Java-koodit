import java.util.ArrayList;
import java.util.Random;

public class NumberSumParallel {
    private static final int N = 32000;

    public static void execute(int[] numbers, int cores) {
        ArrayList<NumberSum> numSums = new ArrayList<>();

        int length = N / cores;
        int start = 0;
        for (int i = 0; i < cores; i++) {
            numSums.add(new NumberSum(numbers, start, start + length - 1));
            start += length;
        }

        long startTime = System.nanoTime();
        for (NumberSum sum : numSums) {
            sum.start();
        }

        int totalSum = 0;
        for (NumberSum sum : numSums) {
            try {
                sum.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
            totalSum += sum.getSum();
        }

        long finishTime = System.nanoTime();
        System.out.println("Time elapsed " + (finishTime-startTime)/10e6 + " ms. Sum: " + totalSum);
    }

    public static void main(String[] args) {
        int[] numbers = new int[N];

        Random random = new Random();
        for (int i = 0; i < N; i++) {
            numbers[i] = random.nextInt(10000);
        }

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.print("1 thread: "); execute(numbers, 1);
        System.out.print("4 threads: "); execute(numbers, 2);
        System.out.print(cores + " threads: "); execute(numbers, cores);
    }
}
