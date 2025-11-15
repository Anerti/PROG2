import java.util.Date;
import java.util.List;

public class Student extends Person {
    private final String group;
    private final Tutor tutor;
    private final List<Grades> grades;

    public Student(String id,
                   String firstName,
                   String lastName,
                   Date birthDate,
                   String email,
                   String phone,
                   String group,
                   Tutor tutor,
                   List<Grades> grades) {
        super(id, firstName, lastName, birthDate, email, phone);
        this.group = group;
        this.tutor = tutor;
        this.grades = grades;
    }

    public String getGroup() {
        return group;
    }
    public Tutor getTutor() {
        return tutor;
    }
    public List<Grades> getGrades(Grades find) {
        for (Grades grade : grades)
            if (grade.equals(find))
                return grades;
        return null;
    }
}
