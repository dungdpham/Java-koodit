import java.util.Arrays;
import java.util.List;

public class ArrayMean {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 24, 1, -5, 78, -44, 97, 67, 13, 0, -82);

        System.out.println(numbers.stream().mapToInt(i -> i)
                            .sum() / (double) numbers.size());

        System.out.println(numbers.stream()
                            .reduce(0, (ans, i) -> ans + i) / (double) numbers.size());

        System.out.println(numbers.stream()
                            .reduce(0, Integer::sum) / (double) numbers.size());

        numbers.stream().mapToInt(i -> i).average().ifPresent(System.out::println);
    }
}
