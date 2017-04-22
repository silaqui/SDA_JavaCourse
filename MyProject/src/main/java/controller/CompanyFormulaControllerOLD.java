package controller;

import application.model.StreetPrefix;
import application.pdf.PdfFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import application.model.Address;
import application.model.Company;
import application.service.DataService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class CompanyFormulaControllerOLD extends Controller {

    @FXML
    private TextField nip;

    @FXML
    private TextField streetNumber;

    @FXML
    private TextField city;

    @FXML
    private TextField flatNumber;

    @FXML
    private TextField companyName;

    @FXML
    private TextField postalCode;

    @FXML
    private TextField Street;

    @FXML
    private Button addButton;

    @FXML
    private RadioButton avenueRadio;

    @FXML
    private RadioButton squareRadio;

    @FXML
    private Button pdfButton;

    @FXML
    void prefixClick(ActionEvent event) {
    }

    @FXML
    void checkBoxClick() {
        int selectedIndex = streetPrefixBox.getSelectionModel().getSelectedIndex();
        switch (selectedIndex) {
            case 0:
                Street.setPromptText("Ulica");
                streetPrefix = StreetPrefix.STREET;
                break;
            case 1:
                Street.setPromptText("Plac");
                streetPrefix = StreetPrefix.SQUARE;
                break;
            case 2:
                Street.setPromptText("Aleja");
                streetPrefix = StreetPrefix.AVENUE;
                break;
        }
    }

    @FXML
    private ChoiceBox streetPrefixBox;

    private StreetPrefix streetPrefix;

    /*
    @FXML
    void radioClick(ActionEvent event) {
        if (event.getSource() instanceof RadioButton) {
            RadioButton currentPrefixRadioButton = (RadioButton) event.getSource();
            String buttonName = currentPrefixRadioButton.getText();
            switch (buttonName) {
                case "Street":

                    streetPrefix = StreetPrefix.STREET;
                    break;
                case "Avenue":
                    streetPrefix = StreetPrefix.AVENUE;
                    break;
                case "Square":
                    streetPrefix = StreetPrefix.SQUARE;
                    break;

            }
        }
    }
*/

    @FXML
    void addButtonClick(ActionEvent event) {

        Company company = bindToModel();

        DataService dataService = new DataService();
        dataService.printOutCompanyInfo(company);
    }

    private Company bindToModel() {
        Company company = new Company();

        company.setName(companyName.getText());

        Address address = new Address();
        address.setStreetPrefix(streetPrefix);
        address.setStreetName(Street.getText());
        address.setStreetNumber(streetNumber.getText());
        address.setFlatNumber(flatNumber.getText());
        address.setPostalCode(postalCode.getText());
        address.setCity(city.getText());

        company.setAdress(address);

        company.setNip(nip.getText());
        return company;
    }

    private ObservableList<String> prefixBoxList = FXCollections.observableArrayList("ul.", "pl.", "al.");

    @FXML
    void initialize() {
        /*
        ToggleGroup group = new ToggleGroup();
        streetRadio.setToggleGroup(group);
        avenueRadio.setToggleGroup(group);
        squareRadio.setToggleGroup(group);
        */
        streetPrefixBox.setItems(prefixBoxList);
        streetPrefix = StreetPrefix.STREET;
        streetPrefixBox.getSelectionModel().selectFirst();


    }

    private boolean validatePostalCode() {
        String regex = "(^\\d{2}-\\d{3}$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(postalCode.getText());
        if (!matcher.matches()) {
            System.out.println("Zly kod pocztowy");
        } else {
            System.out.println("Brawo");
        }
        return matcher.matches();
    }


    @FXML
    void pdfButtonClick(ActionEvent event) {


        Company company = bindToModel();

        PdfFactory pdfFactory = new PdfFactory();
        pdfFactory.createPdfCompany(company);

    }

    @FXML
    private Button validateButton;

    @FXML
    void validateButtonClick(ActionEvent event) {
        validatePostalCode();
    }

    @FXML
    private Button logoutButton;

    @FXML
    void logoutButtonClick(ActionEvent event) throws IOException {
        Parent formulaPageHolder = FXMLLoader.load(getClass().getResource("/LoginView.fxml"));
        Scene formulaPageScene = new Scene(formulaPageHolder);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(formulaPageScene);
        app_stage.setTitle("Logowanie");
        app_stage.show();
    }

}
