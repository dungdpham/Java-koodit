import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the 1st leg: ");
        double firstLeg = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the length of the 2nd leg: ");
        double secondLeg = Double.parseDouble(scanner.nextLine());

        System.out.println("Length of the hypotenuse: " + Math.sqrt(Math.pow(firstLeg, 2) + Math.pow(secondLeg, 2)));

        scanner.close();
    }
}
