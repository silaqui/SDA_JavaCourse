package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import application.model.User;
import application.service.UserService;

import java.io.IOException;

/**
 * Created by RENT on 2017-03-14.
 */
public class LoginController extends Controller {
    private StackPane stackPane;

    public LoginController(StackPane stackPane) {
        this.stackPane = stackPane;
    }

    @FXML
    private Button submit;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField loginTextField;

    public LoginController() {
    }

    @FXML
    void submitOnAction(ActionEvent event) {
//        System.out.println(loginTextField.getText());
//        System.out.println(passwordField.getText());
        UserService userService = new UserService();
        User user = new User(loginTextField.getText(), passwordField.getText());
        boolean isAutenticated = userService.authenticate(user);
        if (isAutenticated){
            getMainController().loadView("MenuView");
        }else {
            showErrorAlert("Nieprawidłowe hasło");
        }
    }
}

