package controller;

import application.model.Bill;
import application.model.BillItem;
import application.model.Payment;
import application.pdf.PdfFactory;
import application.service.BillItemService;
import application.service.DataService;
import application.xml.XmlFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.util.List;

public class BillController extends Controller {

    @FXML
    private Label priceAll;

    @FXML
    private Button printToPdf;

    @FXML
    private Button saveToFile;

    @FXML
    private RadioButton cashRadio;

    @FXML
    private GridPane listgrid;

    @FXML
    private RadioButton cardRadio;

    @FXML
    void cashRadioClick(ActionEvent event) {
        bill.setPayment(Payment.CASH);
//        System.out.println("CASH");
    }

    @FXML
    void cardRadioClick(ActionEvent event) {
        bill.setPayment(Payment.CARD);
//        System.out.println("CARD");
    }

    @FXML
    void saveToFileClick(ActionEvent event) {

        DataService dataService = new DataService(DataService.loadProperties().getProperty("saveBillFilePath"));
        XmlFactory<Bill> xmlFactory = new XmlFactory<Bill>(Bill.class);
        String xmlBill = xmlFactory.objcetToXml(bill);
        dataService.saveData(xmlBill);

    }

    @FXML
    void printToPdfClick(ActionEvent event) {

        PdfFactory pdfFactory = new PdfFactory();
        pdfFactory.createPdfBill(bill);

    }


    Bill bill;

    @FXML
    void initialize() {

        bill = new Bill();

        //ustawianie radio buttonow peymentu
        ToggleGroup group = new ToggleGroup();
        cashRadio.setToggleGroup(group);
        cardRadio.setToggleGroup(group);

        if(bill.getPayment()==Payment.CARD)
        {cardRadio.setSelected(true);}
        if(bill.getPayment()==Payment.CASH)
        {cashRadio.setSelected(true);}

        //ustawianie listy produktow
        BillItemService billItemService = BillItemService.getInstance();
        List<BillItem> list = billItemService.getBillItemList();

        int col = 0;
        int row = 0;
        Integer number = 1;
        for (BillItem line : list) {

            //Kolumna 1: numeracja
            listgrid.add(new Label(number.toString()), col, row + 1);
            number++;

            //Koluna 2: nazwa item'u
            listgrid.add(new Label(line.getItemName()), col + 1, row + 1);

            //Kolumna 3: Cena item'u
            listgrid.add(new Label(line.getPrice() + " PLN"), col + 2, row + 1);

            //Kolumna 4: Ilość zakupiona

            Label itemPriceTotalLabel = new Label();//Label dla kolumny 5

            TextField textField = new TextField();
            textField.setId("amountfield");

            textField.textProperty().addListener((observable, oldValue, newValue) -> {
                bill.updateItem(line, newValue);
                priceAll.setText(bill.getPrice().toString());

                if(line.getAmount()>0){
                itemPriceTotalLabel.setText(line.getPrice()*line.getAmount() + " PLN");}
                else
                {itemPriceTotalLabel.setText("");}

            });
            textField.setPromptText("0");
            textField.setAlignment(Pos.BASELINE_CENTER);

            listgrid.add(textField, col + 3, row + 1);

            //Kolumna 5: Cena zakpu
            listgrid.add(itemPriceTotalLabel, col + 4, row + 1);
            listgrid.setHalignment(itemPriceTotalLabel, HPos.CENTER);

            //Zmiana wersu
            row++;

        }
    }
    @FXML
    private TextField searchTextField;

    @FXML
    void searchTextFieldOnAction(ActionEvent event) {


    }

    @FXML
    void searchTextFieldChangeText(ActionEvent event) {

    }
}
