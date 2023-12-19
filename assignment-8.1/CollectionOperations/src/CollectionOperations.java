import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class CollectionOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 3, 12);

        Predicate<Integer> even = number -> number % 2 == 0;

        numbers.forEach(number -> {
            if (even.test(number)) {
                System.out.print(number + " ");
            }
        });

        System.out.println();
        numbers.replaceAll(number -> (even.test(number)) ? number : number * 2);

        numbers.forEach(number -> System.out.print(number + " "));

        System.out.println();
        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());

        SumList sumList = list -> {
            int sum = 0;
            for (int number : list) {
                sum += number;
            }
            return sum;
        };

        System.out.println(sumList.sumList(numbers));
    }
}
