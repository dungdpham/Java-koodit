import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class FilterSort {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Bruce", 30, "Gotham"));
        persons.add(new Person("Clark", 26, "Metropolis"));
        persons.add(new Person("Diana", 22, "Themyscira"));
        persons.add(new Person("Barry", 20, "Central"));
        persons.add(new Person("Lex", 40, "Metropolis"));

        //Comparator<Person> c = (p1, p2) -> p1.getAge() - p2.getAge();

        persons.sort((p1, p2) -> p1.getAge() - p2.getAge());

        persons.forEach(System.out::println);

        Predicate<Person> f = p -> p.getCity().equals("Metropolis");

        for (Person person : persons) {
            if (f.test(person)) {
                System.out.println(person);
            }
        }
    }
}
