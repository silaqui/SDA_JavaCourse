package zajecia.week2;

/**
 * Created by Miki on 11.02.2017.
 */
public class User {
    public String firstName;
    public String lastName;
    public String birthDate;
    public Address address;

    public User (String firstName, String lastName, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName, String birthDate, Address address) {
        this(firstName, lastName,birthDate);
        this.address = address;
    }

    public void print() {
        System.out.println(firstName + " " + lastName + ", born at " + birthDate);
        if(address!=null){
            address.print();
        }
    }

}


