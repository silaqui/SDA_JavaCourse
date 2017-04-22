import application.model.User;
import application.xml.XmlFactory;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertTrue;

public class XMLFactoryTest {

    private String login;
    private String password;
    private String xmlUserKnown;

    @Before
    public void setUp()  {
        login = "Kowalski";
        password = "1234";
        xmlUserKnown = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><User><login>Kowalski</login><password>1234</password></User>";
    }

    @Test
    public void objectToXML() {
        XmlFactory<User> xmlFactory = new XmlFactory<User>(User.class);
        User user = new User(login, password);
        String xmlUser = xmlFactory.objcetToXml(user);
        assertTrue(xmlUser.equals(xmlUserKnown));
    }

    @Test
    public void XMLToObject() {
        XmlFactory<User> xmlFactoryTest = new XmlFactory(User.class);
        User user = new User(login, password);
        User userFromXml = xmlFactoryTest.XmlToObject(xmlUserKnown);
//        assertTrue(user.getLogin().equals(userFromXml.getLogin()) && user.getPassword().equals(userFromXml.getPassword()));
        assertTrue(user.equals(userFromXml));
    }


}
