package application.model;

import java.util.UUID;

/**
 * Created by Miki on 15.03.2017.
 */
public class Company {
    private UUID id = UUID.randomUUID();
    private Address address;
    private String nip;
    private String regon;
    private String name;

    public Company() {
    }

    public Company(Address address, String nip, String regon, String name) {
        this.address = address;
        this.nip = nip;
        this.regon = regon;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", address=" + address +
                ", nip='" + nip + '\'' +
                ", regon='" + regon + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id.toString();
    }

    public Address gedtAdress() {
        return address;
    }

    public void setAdress(Address address) {
        this.address = address;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
