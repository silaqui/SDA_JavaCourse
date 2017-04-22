package application.consoleMain;

import application.model.Bill;
import application.model.BillItem;
import application.model.Payment;
import application.pdf.PdfFactory;
import application.service.DataService;
import application.service.UserService;
import application.model.User;
import application.xml.XmlFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


//        DataService dataService = new DataService("C:\\Users\\Miki\\Desktop\\data\\data2.dat");
        DataService dataService = new DataService();

//        login();
//        initFile();
//        User userFromFile = dataService.loadData();

        PdfFactory pdfFactory = new PdfFactory();
//        pdfFactory.createPdf();

        Bill bill = new Bill();
        List<BillItem> billItems = listInit();

        bill.addItem(billItems.get(1),3);
        bill.addItem(billItems.get(2),3);
//        bill.removeItem(billItems.get(2),1000);

        for(String e:dataService.printBillInfo(bill))
        {
            System.out.println(e);
        }

        pdfFactory.createPdfBill(bill);



        System.out.println("Ostatnia linia kodu");
    }

    private static void initFile() {

        DataService dataService = new DataService();
        XmlFactory<User> factory = new XmlFactory<User>(User.class);

        User user = new User("Kowalski", "1234");

        String xmlUser = factory.objcetToXml(user);
        dataService.saveData(xmlUser);
    }

    private static void login() {
        Scanner scanner = new Scanner(System.in);

        User user;
        String login;
        String password;
        UserService userService = new UserService();
        boolean LogFlag = true;

        while (LogFlag) {
            System.out.print("Enter login: ");
            login = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            user = new User(login, password);

            if (userService.authenticate(user)) {
                System.out.println("Logged");
                LogFlag = false;
            } else {
                System.out.println("Incorrect password");
            }
        }
    }

    private static List<BillItem> listInit() {

        List<BillItem> billitemList = new ArrayList<>();

        BillItem paczek = new BillItem();
        paczek.setItemName("Paczek");
        paczek.setAmount(1);
        paczek.setPrice(2.70);
        paczek.setDescription("Pączek z marmoladą");
        paczek.setTax(0.08);
        paczek.setCode("72235");
        billitemList.add(paczek);
        BillItem herbata = new BillItem();

        herbata.setItemName("Herbata");
        herbata.setAmount(1);
        herbata.setPrice(1.70);
        herbata.setDescription("Malinowa");
        herbata.setTax(0.22);
        herbata.setCode("62435");

        billitemList.add(herbata);
        BillItem ciachoZeSzpinakiem = new BillItem();
        ciachoZeSzpinakiem.setItemName("Ciastko ze szpinakiem");

        ciachoZeSzpinakiem.setAmount(1);
        ciachoZeSzpinakiem.setPrice(3.70);
        ciachoZeSzpinakiem.setDescription("Ciasto francuskie nadziewane szpinakiem");
        ciachoZeSzpinakiem.setTax(0.08);
        ciachoZeSzpinakiem.setCode("623445");
        billitemList.add(ciachoZeSzpinakiem);

        BillItem kawa = new BillItem();
        kawa.setItemName("Kawa");
        kawa.setAmount(1);
        kawa.setPrice(5.0);
        kawa.setDescription("Swiezo mielona kawa JAVA prosto z plantacji");
        kawa.setTax(0.22);
        kawa.setCode("97034567");
        billitemList.add(kawa);

        return billitemList;
    }
}
