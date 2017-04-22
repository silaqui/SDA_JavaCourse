package zajecia.week2;

/**
 * Created by Miki on 11.02.2017.
 */
public class Address {
    public String city;
    public String street;
    public int number;
    public String zipCode;
    public String land;

    public Address(String city, String street, int number, String zipCode, String land) {
        this.city = city;
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
        this.land = land;

    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(zipCode).append(" ")
                .append(city).append(" ")
                .append(street).append(" ")
                .append(number).append(" ")
                .append(land).append(" ");
        String toPrint = stringBuilder.toString();
        System.out.println(toPrint);
    }

    public Address() {
    }
}
