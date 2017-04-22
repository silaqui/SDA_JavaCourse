package controller;

import application.model.BillItem;
import application.service.BillItemService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


/**
 * Created by RENT on 2017-03-18.
 */
public class BillItemController extends Controller {

    @FXML
    private TextField productTextField;

    @FXML
    private TextField amountTextField;

    @FXML
    private TextField codeTextField;

    @FXML
    private TextField priceTextField;

    @FXML
    private Button addProductButton;

    @FXML
    private TextField taxTextField;

    @FXML
    private TextArea descriptionTextField;

    @FXML
    void addProductController(ActionEvent event) {
        BillItemService billItemService = BillItemService.getInstance();
        BillItem billItem = new BillItem(Integer.valueOf(amountTextField.getText())
                , productTextField.getText()
                , Double.valueOf(priceTextField.getText())
                , Double.valueOf(taxTextField.getText())/100
                , descriptionTextField.getText()
                , codeTextField.getText()
        );
        billItemService.addItem(billItem);
    }
}
