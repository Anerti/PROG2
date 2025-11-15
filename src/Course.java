import java.time.Instant;
import java.util.List;

public class Course {
    private final String id;
    private final String label;
    private final int credits;
    private final Teacher teacher;
    private final List<Exam> exams;

    public Course(String id, String label, int credits, Teacher teacher, List<Exam> exams) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.teacher = teacher;
        this.exams = exams;
    }

    public String getId() {
        return id;
    }
    public String getLabel() {
        return label;
    }
    public int getCredits() {
        return credits;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public List<Exam> getExams() {
        return exams;
    }
}
