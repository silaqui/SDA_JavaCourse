package com.miki.json;

import com.miki.json.AddressBuilder;
import com.miki.json.User;
import com.miki.json.UserBuilder;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

/**
 * Created by Miki on 02.03.2017.
 */
public class JsonMapperTest {

    @Test
    public void test1() throws IOException {
        String jsonToDes = "{\"firstName\":\"Mikolaj\"" +
                ",\"lastName\":\"Wozniak\",\"addresses\"" +
                ":{\"Praca\":{\"street\":\"Elblaska 69\"," +
                "\"code\":\"50-432\",\"city\":\"Warszawa\"}," +
                "\"Dom\":{\"street\":\"Mysliborska 68\",\"code\"" +
                ":\"60-432\",\"city\":\"Poznan\"}},\"childrenNames\":[\"Kasia\",\"Basia\"]}";

        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(jsonToDes, User.class);

        Assert.assertEquals("Mikolaj", user.getFirstName());

    }

    @Test
    public void test2() throws IOException {
        User user = new UserBuilder().withFirstName("Miki").withLastName("Woz")
                .withAddress("Work", new AddressBuilder()
                        .withCity("Poz")
                        .withCode("60-432")
                        .withStreet("Mys 50")
                        .build()
                ).withChildren("Ania")
                .build();

        Assert.assertEquals("Miki", user.getFirstName());
        Assert.assertEquals("Woz", user.getLastName());

        ObjectMapper mapper = new ObjectMapper();
        String serializedObject = mapper.writeValueAsString(user);

        Assert.assertTrue(serializedObject.contains("\"city\":\"Poz\""));
        Assert.assertTrue(serializedObject.contains("60-432"));
    }

    @Test
    public void test3() throws IOException {
        User user = new UserBuilder().withLastName("Miki")
                .withChildren((List<String>) null).build();

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);

        System.out.println(json);
    }

}


