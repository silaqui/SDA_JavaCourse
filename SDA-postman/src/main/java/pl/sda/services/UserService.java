package pl.sda.services;

import org.codehaus.jackson.map.ObjectMapper;
import pl.sda.entities.User;
import pl.sda.servlets.responses.CreateUserResponse;
import pl.sda.servlets.responses.UpdateUserReponse;
import pl.sda.storage.Storage;

import java.io.IOException;
import java.util.UUID;

public class UserService {
    public CreateUserResponse addUser(String userJson)
    {
        ObjectMapper mapper = new ObjectMapper();
        CreateUserResponse response = new CreateUserResponse();

        try {
            User user = mapper.readValue(userJson, User.class);
            UUID id = UUID.randomUUID();
            user.setId(id);

            Storage.addUser(user);
            response.setStatus("OK");
            response.setId(id.toString());
        } catch (IOException e) {
            response.setError(e.getMessage());
        }


        return response;
    }

    public static User getUserById(String id) {
        User result = null;
        if (id != null && !id.isEmpty()) {
            UUID uuid = UUID.fromString(id);

            for (User user :
                    Storage.getUsers()) {
                if (user.getId().equals(uuid)) {
                    result = user;
                    break;
                }
            }
        }
        return result;
    }

    public static String deleteUserById (String id)
    {
        UUID uuid = UUID.fromString(id);

        return(Storage.removeUser(uuid));


    }

    public static UpdateUserReponse updateUser(User user)
    {
        UpdateUserReponse response = new UpdateUserReponse();

        Storage.updateUser(user);

        response.setStatus("OK");
        response.setMessage("User update");

        return response;
    }

}


