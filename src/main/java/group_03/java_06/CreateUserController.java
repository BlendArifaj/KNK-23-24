package group_03.java_06;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CreateUserController {

    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtFirstName;
    @FXML
    private TextField txtLastName;
    @FXML
    private PasswordField pwdPassword;
    @FXML
    private void handleSave(ActionEvent ae){
        System.out.println("Username: " + this.txtUsername.getText());
        System.out.println("First name: " + this.txtFirstName.getText());
        System.out.println("Last name: " + this.txtLastName.getText());
        System.out.println("Password: " + this.pwdPassword.getText());
    }
    @FXML
    private void handleCancel(ActionEvent ae){
        this.txtUsername.clear();
        this.txtFirstName.clear();
        this.txtLastName.clear();
        this.pwdPassword.clear();
    }

}
















