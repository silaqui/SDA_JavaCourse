package application.model;


public class Address {



    private StreetPrefix streetPrefix;
    private String streetName;
    private String streetNumber;
    private String flatNumber;
    private String postalCode;
    private String city;
    private String country;

    public Address() {
    }



    public Address(StreetPrefix prefix, String streetName, String streetNumber, String flatNumber, String postalCode, String city, String country) {
        this.streetPrefix = prefix;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.flatNumber = flatNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return streetPrefix.getPrefix()+
                "" + streetName +
                " " + streetNumber +
                "/" + flatNumber +
                "\n" + postalCode +
                " " + city;

    }

    public void setStreetPrefix(StreetPrefix streetPrefix) {
        this.streetPrefix = streetPrefix;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
