import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grades {
    private final Student student;
    private List<GradeHistory> history;
    private final Exam exam;

    public Grades(Student student, double grade, String description, Exam exam) {
        this.student = student;
        this.exam = exam;
        this.history = new ArrayList<>();
        this.history.add(new GradeHistory(grade, description));
    }

    public void addGrade(GradeHistory newGrade){
        history.add(newGrade);
    }

    public void removeGradeByDate(Instant date){
        history.removeIf(grade -> grade.getDate().equals(date));
    }

    public void editGradeByDate(Instant date, double newGrade, String description){
        for (GradeHistory grade : history)
            if (grade.getDate().equals(date))
                grade.setNewGrade(new GradeHistory(newGrade, description));
    }

    public double getGradeAt(Instant date){
        for (GradeHistory grade : history)
            if (grade.getDate().equals(date))
                return grade.getNewGrade();
        throw new IllegalArgumentException("No grade not found");
    }

    public Student getStudent() {
        return student;
    }
    public Exam getExam() {
        return exam;
    }
}
