package pl.sda.builder;

public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();

        PersonAddress address = new PersonAddress();
        address.setCity("Poznań");
        address.setStreet("Baraniaka 88");
        address.setPostalCode("60-111");

        Person person = personBuilder.withFirstName("Jaś").withLastName("Kowalski")
                .withPesel("95020201111").withPersonAddress(address)
                .build();

        System.out.print(person.toString());


    }
}
