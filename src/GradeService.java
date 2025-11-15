import java.time.Instant;
import java.util.List;

public class GradeService {
    private final List<Grades> grades;

    public GradeService(List<Grades> grades) {
        this.grades = grades;
    }

    public double getExamGrade(Exam exam, Student student, Instant t) {
        for (Grades grade : grades)
            if (grade.getExam().equals(exam) && grade.getStudent().equals(student))
                return grade.getGradeAt(t);

        throw new IllegalArgumentException("No grade found for these parameters");
    }

    public double getCourseGrade(Course course, Student student, Instant t) {
        double total = 0;
        int coefSum = 0;
        List<Exam> exams = course.getExams();

        for (Exam e : exams) {
            double g = getExamGrade(e, student, t);
            total += g * e.getCoefficient();
            coefSum += e.getCoefficient();
        }

        if (coefSum == 0)
            throw new IllegalArgumentException("Course has no exams");

        return total / coefSum;
    }
}
