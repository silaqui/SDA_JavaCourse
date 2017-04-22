package com.miki.json;

import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        User user1 = new User();

        user1.setFirstName("Mikołaj");
        user1.setLastName("Woźnaik");

        Address address1 = new Address("Myśliborska 68", "60-432", "Poznań");
        Address address2 = new Address("Elbloąska 69", "50-432", "Warszawa");

        Map<String, Address> addresses = new HashMap<>();
        addresses.put("Dom", address1);
        addresses.put("Praca", address2);
        user1.setAddresses(addresses);

        List<String> childrens = new ArrayList<>();
        childrens.add("Kasia");
        childrens.add("Basia");
        user1.setChildrenNames(childrens);

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user1);
        System.out.println(json);

        User user2 = new UserBuilder().withFirstName("aa").build();
        System.out.println(user2.getFirstName());


    }
}
