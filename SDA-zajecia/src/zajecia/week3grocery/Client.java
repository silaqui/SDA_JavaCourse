package zajecia.week3grocery;

import zajecia.week2.Address;

/**
 * Created by Miki on 13.02.2017.
 */
public class Client {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Client(String firstName, String lastName, String phoneNumber, Address address) {
        this(firstName, lastName);
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "[" + firstName + "\t" + lastName + "\t" + phoneNumber + "]";
    }
}
