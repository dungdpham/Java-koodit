import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;

        do {
            System.out.println("(Int, a != 0) a = ");
            a = Integer.parseInt(scanner.nextLine());
        } while (a == 0);

        System.out.println("(Int) b = ");
        b = Integer.parseInt(scanner.nextLine());

        System.out.println("(Int) c = ");
        c = Integer.parseInt(scanner.nextLine());

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            System.out.printf("Roots: x1 = %f and x2 = %f", (- b + Math.sqrt(delta))/ (2 * a), (- b - Math.sqrt(delta))/ (2 * a));
        } else if (delta == 0) {
            System.out.printf("Root: x = %.3f", (double) (- b / (2 * a)));
        } else {
            System.out.println("No real roots");
        }

        scanner.close();
    }
}
