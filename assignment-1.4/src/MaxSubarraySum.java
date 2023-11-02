import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;

        do {
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt();
        } while (size < 1);

        int[] array = new int[size];

        System.out.println("Enter the integers into the array: ");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int maxSum = array[0];
        String subArray = "0";

        for (int start = 0; start < size; start++) {
            for (int end = start; end < size; end++) {
                int sum = 0;

                for (int j = start; j <= end; j++) {
                    sum += array[j];
                }

                if (sum >= maxSum) {
                    maxSum = sum;

                    if (start != end) {
                        subArray = (start + 1) + " - " + (end + 1);
                    } else {
                        subArray = Integer.toString(start);
                    }
                }
            }
        }

        System.out.println("\nMaximum sum: " + maxSum);
        System.out.println("Integers: " + subArray);
    }
}

