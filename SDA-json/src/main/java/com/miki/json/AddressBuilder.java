package com.miki.json;

/**
 * Created by Miki on 02.03.2017.
 */
public class AddressBuilder {

    private Address address = new Address();

    public AddressBuilder withStreet (String street){
        address.setStreet(street);
        return this;
    }
    public AddressBuilder withCode (String code){
        address.setCode(code);
        return this;
    }
    public AddressBuilder withCity (String city){
        address.setCity(city);
        return this;
    }

    public Address build() {

        return address;
    }
}
