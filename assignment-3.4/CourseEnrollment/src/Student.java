import java.io.*;

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private static int count = 0;

    public Student(String name, int age) {
        count++;
        this.id = count;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return getName() + " [Id: " + getId() + "], age: " + getAge();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
