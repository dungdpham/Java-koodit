import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit: ");
        double f = Double.parseDouble(scanner.nextLine());

        System.out.printf("The entered temperature in Celsius: %.1f", (f - 32) / 1.8);

        scanner.close();
    }
}
