import java.util.Scanner;
import java.util.Random;

public class MultiplicationTableExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int a, b, point = 0, setCount = 1;

        while (point != 10) {
            System.out.println("Exam set " + setCount);

            for (int i = 1; i <= 10; i++) {
                a = random.nextInt(1, 11);
                b = random.nextInt(1, 11);

                System.out.print("Question " + i + ":\n" + a + " * " + b + " = ");
                int answer = scanner.nextInt();

                if (answer == a * b) {
                    point += 1;
                    System.out.print("Correct! ");
                } else {
                    System.out.print("Incorrect! ");
                }

                System.out.println("Your point: " + point);
            }

            if (point < 10) {
                System.out.println("You failed the exam. Try again!\n");

                point = 0;
                setCount += 1;
            } else {
                System.out.println("You passed! Congrats!");
            }
        }
    }
}
