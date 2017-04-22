package application.service;

import application.model.Bill;
import application.model.BillItem;
import application.model.Company;
import application.model.User;
import application.xml.XmlFactory;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by Miki on 13.03.2017.
 */
public class DataService {

    private File file;

    public DataService() {
        this(loadProperties().getProperty("randomUsePath") + File.separator +"data.dat");
    }

    public DataService(String fileDirection) {
        this.file = new File(fileDirection);
    }

    public void saveData(String xmlString) {

        try {

            FileUtils.touch(file);
            FileUtils.writeStringToFile(file, xmlString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public User loadData() {
        XmlFactory<User> xmlFactory = new XmlFactory<User>(User.class);
        String XMLFromFile = null;

        try {
            XMLFromFile = FileUtils.readFileToString(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return xmlFactory.XmlToObject(XMLFromFile);
    }

    public Bill loadBillData() {
        XmlFactory<Bill> xmlFactory = new XmlFactory<Bill>(Bill.class);
        String XMLFromFile = null;

        try {
            XMLFromFile = FileUtils.readFileToString(file,"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xmlFactory.XmlToObject(XMLFromFile);

    }

    public List<String> printCompanyInfo(Company company) {
        List<String> result = new ArrayList();
        result.add(company.getName());
        result.add(company.gedtAdress().toString());
        result.add(company.getNip().toString());


        return result;
    }

    public List<String> printBillInfo(Bill bill)
    {
        List<String> result = new ArrayList();
        DecimalFormat df = new DecimalFormat("#.##");
//        result.add(bill.getId().toString());

        SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy");
        result.add(dt1.format(bill.getDate()).toString());

        result.add("___________________________________");
        for(BillItem e : bill.getListOfItems())
        {
            result.add(e.getAmount()+" x "+ e.getItemName() + " "
                    + df.format(e.getPrice())+" zl = "+" "+
                    df.format(e.getAmount()*e.getPrice()) + " zl");
        }
        result.add("___________________________________");
        result.add("\t Cena: \t" + df.format(bill.getPrice()).toString());
        result.add("Zaplacono:\t"+ bill.getPayment().getPayment());


        return result;
    }

    public void printOutCompanyInfo(Company company) {
        List<String> info = printCompanyInfo(company);
        for (String e : info) {
            System.out.println(e);
        }
    }

    public static Properties loadProperties() {
        Properties result = new Properties();
        InputStream inputStream;
        inputStream = DataService.class.getClassLoader().getResourceAsStream("data.properties");
        try {
            result.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

}


