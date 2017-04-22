package pl.sda.json;

import com.miki.json.Movie;
import com.miki.json.User;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class JacksonTest {

    @Test
    public void test1() throws IOException {
        String jsonToDeserialize = "{\"firstName\":\"Bartosz\"," +
                "\"lastName\":\"Nowak\"," +
                "\"addresses\":{\"Home\":{\"street\":\"Al. Niepodległości\",\"city\":\"Poznań\"}}}";


        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(jsonToDeserialize, User.class);

        Assert.assertEquals("Bartosz", user.getFirstName());


    }

    @Test
    public void test2() throws IOException {
        String jsonToDeserialize = "{\"originalTitle\":\"Saving Private Ryan\",\"plTitle\":\"Szeregowiec Ryan\",\"director\":{\"firstName\":\"Steven\",\"lastName\":\"Spielberg\"}}";

        ObjectMapper mapper = new ObjectMapper();
        Movie film = mapper.readValue(jsonToDeserialize, Movie.class);

        Assert.assertEquals("Saving Private Ryan",film.getOriginalTitle());


    }

    @Test
    public void test3() throws IOException {
        String jsonToDeserialize = "{\"originalTitle\":\"Empire Strikes Back\",\"plTitle\":\"Imperium kontratakuje\",\"director\":{\"firstName\":\"Irvin\",\"lastName\":\"Kershner\"}, \"boxOffice\":538375067}";

        ObjectMapper mapper = new ObjectMapper();
        Movie film = mapper.readValue(jsonToDeserialize, Movie.class);

        Assert.assertEquals("Empire Strikes Back",film.getOriginalTitle());
        Assert.assertEquals(538375067,(int)film.getBoxOffice());

    }
}

