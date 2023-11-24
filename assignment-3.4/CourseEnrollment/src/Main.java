import java.io.*;

public class Main {
    private static final String FILENAME = "enrollment.ser";

    public static void main(String[] args) {
        Student student1 = new Student("Andy", 22);
        Course course1 = new Course("CPP-01", "C Plus Plus", "Zero");
        Enrollment enrollment1 = new Enrollment(student1, course1, "11.09.2001");

        File f = new File(FILENAME);
        Enrollment enrollmentFromFile;

        try (
                FileOutputStream outputStream = new FileOutputStream(FILENAME);
                ObjectOutputStream objects = new ObjectOutputStream(outputStream)
        ) {
            objects.writeObject(enrollment1);
        } catch (Exception e) {
            System.err.println("Writing error: " + e);
        }

        if (f.exists() && f.isFile()) {
            try (
                    FileInputStream inputStream = new FileInputStream(FILENAME);
                    ObjectInputStream objects = new ObjectInputStream(inputStream)
            ) {
                enrollmentFromFile = (Enrollment) objects.readObject();
                System.out.println(enrollmentFromFile);
            } catch (Exception e) {
                System.err.println("Reading error: " + e);
            }
        }
    }
}
