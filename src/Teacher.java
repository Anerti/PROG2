import java.util.Date;

public class Teacher extends Person {
    private final Speciality speciality;

    public Teacher(String id,
                   String firstName,
                   String lastName,
                   Date birthDate,
                   String email,
                   String phone,
                   Speciality speciality) {
        super(id, firstName, lastName, birthDate, email, phone);
        this.speciality = speciality;
    }
}
