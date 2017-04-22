package application.service;

import application.model.User;

/**
 * Created by Miki on 13.03.2017.
 */
public class UserService {


    public boolean authenticate(User user) {


        DataService dataService = new DataService(DataService.loadProperties().getProperty("userFilePath"));
        User userFromFile = dataService.loadData();

        return user.equals(userFromFile);
    }
}
