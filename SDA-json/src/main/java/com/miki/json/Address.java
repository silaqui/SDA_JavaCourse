package com.miki.json;

/**
 * Created by Miki on 02.03.2017.
 */
public class Address {

    private String street;
    private String code;
    private String city;

    public Address() {
    }

    public Address(String ulica, String kodPocztowy, String miasto) {
        this.street = ulica;
        this.code = kodPocztowy;
        this.city = miasto;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
