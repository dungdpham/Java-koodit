import java.util.Scanner;

public class DuplicateRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;

        do {
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt();
        } while (size < 1);

        int[] sourceArray = new int[size];

        System.out.println("Enter the integers into the array: ");

        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            sourceArray[i] = scanner.nextInt();
        }

        int[] newArray = new int[size];
        int count = 0;

        for (int i = 0; i < size; i++) {
            boolean duplicate = false;

            for (int j = 0; j < count; j++) {
                if (sourceArray[i] == newArray[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                newArray[count] = sourceArray[i];
                count += 1;
            }
        }

        System.out.println("\nThe array without duplicates: ");
        for (int k = 0; k < count; k++) {
            System.out.print(newArray[k] + " ");
        }
    }
}
