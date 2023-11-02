import java.util.Scanner;
import java.util.Random;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] firstNames = {"Bruce", "Clark", "Tony", "Peter", "Steve", "Barry", "Arthur", "Hal", "Martian", "Wanda"};
        String[] lastNames = {"Wayne", "Kent", "Stark", "Parker", "Rogers", "Allen", "Curry", "Jordan", "Manhunter", "Maximoff"};

        int amount, maximum = firstNames.length * lastNames.length;

        do {
            System.out.print("How many random names (max " + maximum + " names)? ");
            amount = scanner.nextInt();
        } while (amount < 1 || amount > maximum);

        String[] names = new String[amount];

        for (int i = 0; i < amount; i++) {
            String randomName;
            boolean repeat;

            do {
                repeat = false;

                int randomFirstName = random.nextInt(firstNames.length);
                int randomLastName = random.nextInt(lastNames.length);

                randomName = firstNames[randomFirstName] + " " + lastNames[randomLastName];

                for (String name : names) {
                    if (name != null && name.equals(randomName)) {
                        repeat = true;
                        //System.out.println("REPEAT!!! " + randomName);
                        break;
                    }
                }
            } while (repeat);

            names[i] = randomName;

            System.out.println(i + 1 + ": " + randomName);
        }
    }
}
