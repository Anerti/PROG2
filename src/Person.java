import java.util.Date;

public class Person {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final Date birthDate;
    private final String email;
    private final String phone;

    public Person(String id,
                  String firstName,
                  String lastName,
                  Date birthDate,
                  String email,
                  String phone) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
    }
    public String getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }

}
