package zajecia.week2;

/**
 * Created by Miki on 11.02.2017.
 */
public class Author {
    public String firstName;
    public String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return (firstName + " " + lastName);

    }
}
