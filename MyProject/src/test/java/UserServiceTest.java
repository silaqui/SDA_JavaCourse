import application.model.User;
import application.service.UserService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UserServiceTest {

    private String login;
    private String password;

    @Before
    public void setUp()  {
        login = "Kowalski";
        password = "1234";
    }

    @Test
    public void authenticationTest()
    {
        User user = new User(login,password);

        UserService userService = new UserService();

        assertTrue(userService.authenticate(user));
    }
}
