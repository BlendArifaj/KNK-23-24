package group_01.java_05;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AppController {
    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField pwdPassword;

    @FXML
    private void handleLogin(ActionEvent ae){
        System.out.println(this.txtUsername.getText());
        System.out.println(this.pwdPassword.getText());

    }

    @FXML
    private void handleClear(ActionEvent ae){
        System.out.println("Clear");

    }
}
