package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miki on 21.03.2017.
 */
public class MainScore {

    List<User> userList;

    public MainScore() {
        this.userList = new ArrayList<>();
    }

    public void addUser (User user)
    {
        this.userList.add(user);
    }
}
