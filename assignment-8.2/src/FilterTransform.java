import java.util.Arrays;
import java.util.List;

public class FilterTransform {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 24, 1, -5, 78, -44, 97, 67, 13, 0, -82);

        System.out.println("Original Collection:");
        numbers.forEach(i -> System.out.print(i + " "));

        List<Integer> numbersOdd = numbers.stream().filter(i -> i % 2 != 0).toList();
        System.out.println("\nNo even numbers:");
        numbersOdd.forEach(i -> System.out.print(i + " "));

        List<Integer> numbersDoubled = numbersOdd.stream().map(i -> i * 2).toList();
        System.out.println("\nDouble remaining numbers:");
        numbersDoubled.forEach(i -> System.out.print(i + " "));

        System.out.println("\nSum of remaining numbers:");
        System.out.println(numbersDoubled.stream().mapToInt(i -> i).sum());
        System.out.println(numbersDoubled.stream().reduce(0, Integer::sum));

        // Combine all operations
        int result = numbers.stream()
                    .filter(i -> i % 2 != 0)
                    .map(j -> j * 2)
                    .reduce(0, Integer::sum);

        int result2 = numbers.stream()
                    .filter(i -> i % 2 != 0)
                    .mapToInt(j -> j * 2)
                    .sum();

        System.out.println(result + " " + result2);
    }
}
