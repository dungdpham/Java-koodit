import java.io.*;

public class Course implements Serializable {
    private String courseCode;
    private String courseName;
    private String instructor;

    public Course(String code, String name, String instructor) {
        courseCode = code;
        courseName = name;
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "\"" + getCourseName() + "\" [code: " + getCourseCode() + "], instructor: " + getInstructor();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
