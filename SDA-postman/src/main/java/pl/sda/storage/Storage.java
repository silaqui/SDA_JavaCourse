package pl.sda.storage;

import org.codehaus.jackson.map.ObjectMapper;
import pl.sda.entities.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Miki on 04.03.2017.
 */
public class Storage {

    private static List<User> users = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static List<User> getUsers() {
        return users;
    }

    public static String removeUser(UUID id) {
        String result = "User not found";
        User toRemove = null;

        for (User user : users)
            if (user.getId().equals(id)) {
                    toRemove = user;
            }

            if (toRemove != null) {
            ObjectMapper mapper = new ObjectMapper();
            try {
                result = "Removed: " + mapper.writeValueAsString(toRemove);
            } catch (IOException e) {
                e.printStackTrace();
            }
            users.remove(toRemove);

        }
        return result;
    }

    public static void updateUser (User user)
    {
        UUID id = user.getId();
        for (User userToUpdate: users){
            if(userToUpdate.getId().equals(id))
            {
                userToUpdate.setLogin(user.getLogin());
                userToUpdate.setMail(user.getMail());
                userToUpdate.setName(user.getName());
            }
        }
    }


}
