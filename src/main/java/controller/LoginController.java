package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.dto.LoginUserDto;
import service.UserService;

public class LoginController {
    @FXML
    private TextField txtEmail;
    @FXML
    private PasswordField pwdPassword;
    @FXML
    private void handleLoginClick(ActionEvent ae){
        LoginUserDto loginUserData = new LoginUserDto(
          this.txtEmail.getText(),
          this.pwdPassword.getText()
        );

        boolean isLogin = UserService.login(loginUserData);

        if(!isLogin){
//            ....
        }
//        ....

    }
}
