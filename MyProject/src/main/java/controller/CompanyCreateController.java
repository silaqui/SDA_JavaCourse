package controller;

/**
 * Created by RENT on 2017-03-15.
 */

import com.sun.javafx.charts.Legend;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import application.model.Address;
import application.model.Company;
import application.model.StreetPrefix;
import application.pdf.PdfFactory;
import application.service.DataService;

import java.text.BreakIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompanyCreateController extends Controller {

    @FXML
    private TextField streetField;

    @FXML
    private TextField postCodeField;

    @FXML
    private TextField houseNumberField;

    @FXML
    private TextField companyNameField;

    @FXML
    private TextField cityField;

    @FXML
    private RadioButton streetRadio;

    @FXML
    private TextField flatNumberField;

    @FXML
    private RadioButton squereRadio;

    @FXML
    private Button addCompanyField;

    @FXML
    private RadioButton avenueRadio;

    @FXML
    private TextField nipField;
    private StreetPrefix streetPrefix;
    private int buttonName;
    private BreakIterator nameField;
    private BreakIterator postalCodeField;
    private Legend.LegendItem postalCodeTextField;

    @FXML
    void choosePrefixOnAction(ActionEvent event) {
        if (event.getSource() instanceof RadioButton) { //czy event getsource jest instancją klasy radiobutton
            RadioButton currentPrefixRadioButton = (RadioButton) event.getSource(); //rzutowanie typów
            String buttonName = currentPrefixRadioButton.getText();
            switch (buttonName) {
                case "Ulica":
                    streetPrefix = StreetPrefix.STREET;
                    break;
                case "Aleja":
                    streetPrefix = StreetPrefix.AVENUE;
                    break;
                case "Plac":
                    streetPrefix = StreetPrefix.SQUARE;
                    break;
            }
//            currentPrefixRadioButton.get

        }
    }

    @FXML
    Company addCompanyOnAction() {
        return bindToModel();
    }

    private Company bindToModel() {
        Company company = new Company();
        company.setName(companyNameField.getText());
        Address address = new Address();
        address.setStreetPrefix(streetPrefix);
        address.setStreetName(streetField.getText());
        address.setFlatNumber(houseNumberField.getText());
        address.setFlatNumber(flatNumberField.getText());
        address.setPostalCode(postCodeField.getText());
        address.setCity(cityField.getText());
        address.setCity(cityField.getText());
        company.setAdress(address);
        company.setNip(nipField.getText());
        DataService dataService = new DataService();
        dataService.printOutCompanyInfo(company);
        validatePostalCode();
        return company;
    }

    @FXML
    void initialize() {
        ToggleGroup group = new ToggleGroup();
        streetRadio.setToggleGroup(group);
        squereRadio.setToggleGroup(group);
        avenueRadio.setToggleGroup(group);
    }

    private void validatePostalCode() {
        Pattern zipPattern = Pattern.compile("(^\\d{2}-\\d{3}$)");
        Matcher zipMatcher = zipPattern.matcher(postalCodeTextField.getText());
        if (zipMatcher.find()) {
            String zip = zipMatcher.group(1);
            showConfirmationAlert("Everything alright!");
        } else {
            showErrorAlert("Sorry! Wrong postal code");
        }
    }

    @FXML
    void createPDFOnAction(ActionEvent event) {
        PdfFactory pdfFactory = new PdfFactory();
        pdfFactory.createPdfCompany(addCompanyOnAction());
    }

    @FXML
    void ValidateOnAction(ActionEvent event) {
        validatePostalCode();
    }
}

