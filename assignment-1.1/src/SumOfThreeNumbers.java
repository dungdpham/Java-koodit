import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        int third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));

        System.out.println("The product of the numbers is " + (first * second * third));

        // To avoid integer division (both the sum and 3 are integers) and show the average as floating point number,
        // we need to use floating point division: by casting one of the operands (here is the variable 'sum') as
        // floating point type (double).
        double sum = first + second + third;

        System.out.println("The average of the numbers is " + sum / 3);

        // Alternative
        //System.out.printf("The average of the numbers is %.15f", (double) (first + second + third) / 3);

    }
}