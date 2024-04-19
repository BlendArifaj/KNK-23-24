package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.dto.UserDto;
import service.UserService;

public class SignUpController {
    @FXML
    private TextField txtFirstName;
    @FXML
    private TextField txtLastName;
    @FXML
    private TextField txtEmail;
    @FXML
    private PasswordField pwdPassword;
    @FXML
    private PasswordField pwdConfirmPassword;

    @FXML
    private void handleSignUp(ActionEvent ae){
        UserDto userSignUpData = new UserDto(
            this.txtFirstName.getText(),
            this.txtLastName.getText(),
            this.txtEmail.getText(),
            this.pwdPassword.getText(),
            this.pwdConfirmPassword.getText()
        );

        boolean response = UserService.signUp(userSignUpData);


    }

    @FXML
    private void handleCancel(ActionEvent ae){

    }
}
