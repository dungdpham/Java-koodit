import java.util.Scanner;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start, end;

        do {
            System.out.println("Enter start int number: ");
            start = Integer.parseInt(scanner.nextLine());
        } while (start <= 0);

        do {
            System.out.println("Enter end int number (> start): ");
            end = Integer.parseInt(scanner.nextLine());
        } while (end <= start);

        System.out.println("Prime numbers: ");

        for (int n = start; n <= end; n++) {
            boolean isPrime = true;

            if (n == 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.floor(Math.sqrt(n)); i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(n);
            }
        }

        scanner.close();
    }
}
