import application.model.Address;
import application.model.Company;
import application.model.StreetPrefix;
import application.model.User;
import application.service.DataService;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class DataServiceTest {


    private String login;
    private String password;
    private String xmlUserKnown;
    private Company company;

    private DataService dataService;

    @Before
    public void setUp()  {
        dataService = new DataService();
        login = "Kowalski";
        password = "1234";
        xmlUserKnown = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><User><login>Kowalski</login><password>1234</password></User>";
        company = new Company();
        company.setName("Biedronka");
        company.setAdress(new Address(StreetPrefix.STREET,"Cwiartki","3","4","60-123","Wroclaw","Polska"));
        company.setNip("1234");
        company.setRegon("12345");
    }

    @Test
    public void XMLFileReadOnly(){

        User userFromFile = dataService.loadData();
        User user = new User(login,password);

        assertTrue(userFromFile.equals(user));
    }

  @Test
    public void XMLFileWriteOnly(){

        dataService.saveData(xmlUserKnown);

        assertTrue(true);
    }

    @Test
    public void XMLFileWriteAndRead() {

        dataService.saveData(xmlUserKnown);
        User user = new User(login, password);

        User userFromFile = dataService.loadData();

        assertTrue(user.equals(userFromFile));
    }

    @Test public void printCompany()
    {
        List<String> companyInfo = dataService.printCompanyInfo(company);
        boolean resultAssert = true;
        resultAssert &= companyInfo.get(0).equals("Biedronka");
        resultAssert &= companyInfo.get(1).equals("ul.Cwiartki 3/4\n60-123 Wroclaw");
        resultAssert &= companyInfo.get(2).equals("1234");

        for (String e:companyInfo)
        {
            System.out.println(e);
        }

        assertTrue(resultAssert);
    }


}
