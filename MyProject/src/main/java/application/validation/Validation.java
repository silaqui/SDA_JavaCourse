package application.validation;

import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 * Created by Miki on 21.03.2017.
 */
public class Validation {

    protected boolean validatePostalCode(TextField postalCodeTextField) {
        boolean flag = false;
        Pattern zipPattern = Pattern.compile("(^\\d{2}-\\d{3}$)");
        Matcher zipMatcher = zipPattern.matcher(postalCodeTextField.getText());
        if (zipMatcher.find()) {
            String zip = zipMatcher.group(1);
            flag = true;}
        return flag;
    }

    protected boolean validateStringTextField(TextField givenStringTextField) {
        boolean flag = false;
        if (givenStringTextField.getText() == null || givenStringTextField.getText().equals("")) {
            flag = true;
        } else if (!isAlphaNumeric(givenStringTextField.getText())) {
            flag = true;
        }
        return flag;
    }

    private boolean isAlphaNumeric(String s) {
        String pattern = "^[a-zA-Z0-9]*$";
        return s.matches(pattern);
    }

    protected boolean validateIntegerTextField(TextField givenIntegerTextField) {
        boolean flag = false;
        if (givenIntegerTextField.getText() == null || givenIntegerTextField.getText().equals("")) {
            flag = true;
        }
        String properString = givenIntegerTextField.getText();
        if (properString.equals("0") || !Pattern.matches("^\\d{1,9}$", properString)) {
            flag = true;
        }
        return flag;
    }

    protected boolean validateDoubleTextField(TextField givenDoubleTextField) {
        boolean flag = false;
        if (givenDoubleTextField.getText() == null || givenDoubleTextField.getText().equals("")) {
            flag = true;
        }
        String properString = givenDoubleTextField.getText().replaceAll(",", ".");
        if (!Pattern.matches("^[+]?\\d{1,10}+(\\.?(\\d{0,2}))?$", properString)) {
            flag = true;
        }
        return flag;
    }
}
