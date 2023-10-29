import java.util.Scanner;

public class ObsoleteMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gram, luoti, naula, leiviskä;

        System.out.print("Weight (g): ");
        gram = scanner.nextDouble();

        leiviskä = Math.floor(gram / (13.28 * 32 * 20));
        naula = Math.floor((gram % (13.28 * 32 * 20)) / (13.28 * 32));
        //naula = Math.floor((gram / (13.28 * 32 * 20) - leiviskä) * 20); // Alternative
        luoti = gram / 13.28 - leiviskä * 20 * 32 - naula * 32;

        System.out.printf("%.2f grams is %d leiviskä, %d naula, and %.2f luoti.", gram, (int) leiviskä, (int) naula,
                luoti);

        scanner.close();
    }
}
