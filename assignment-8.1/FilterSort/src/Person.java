public class Person {
    private String name, city;
    private int age;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age + ", city: " + city + ".";
    }
}
