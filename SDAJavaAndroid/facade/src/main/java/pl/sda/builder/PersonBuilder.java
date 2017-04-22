package pl.sda.builder;

public class PersonBuilder {
    private Person person;

    public PersonBuilder() {
        person = new Person();
    }

    public PersonBuilder withFirstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    public  PersonBuilder withLastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    public  PersonBuilder withPersonAddress(PersonAddress personAddress) {
        person.setAddress(personAddress);
        return this;
    }

    public  PersonBuilder withPesel(String pesel) {
        person.setPesel(pesel);
        return this;
    }

    public Person build() {
        return person;
    }

}
