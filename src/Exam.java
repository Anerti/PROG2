import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exam {
    private final String id;
    private final String title;
    private final Course course;
    private final LocalDate date;
    private final int coefficient;
    private final List<Grades> allGrades;

    public Exam(String id, String title, Course course, LocalDate date, int coefficient) {
        this.id = id;
        this.title = title;
        this.course = course;
        this.date = date;
        this.coefficient = coefficient;
        this.allGrades = new ArrayList<>();
    }

    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Course getCourse() {
        return course;
    }
    public LocalDate getDate() {
        return date;
    }
    public int getCoefficient() {
        return coefficient;
    }

}
