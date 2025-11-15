import java.util.Date;
import java.util.Map;

public class Tutor extends Person{
    private final Map<Student, String> linkToStudent;

    public Tutor(String id,
                 String firstName,
                 String lastName,
                 Date birthDate,
                 String email,
                 String phone,
                 Map<Student, String> linkToStudent) {
        super(id, firstName, lastName, birthDate, email, phone);
        this.linkToStudent = linkToStudent;
    }
}
