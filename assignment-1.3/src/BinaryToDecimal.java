import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String binary;
        int decimal = 0;

        do {
            System.out.println("Binary number: ");
            binary = scanner.nextLine();
        } while (!binary.matches("[01]+"));

        for (int i = 0; i <= (binary.length() - 1); i++) {
            decimal += Integer.parseInt(String.valueOf(binary.charAt(binary.length() - 1 - i))) * (int) Math.pow(2, i);
        }

        System.out.println("Decimal value: " + decimal);
    }
}
