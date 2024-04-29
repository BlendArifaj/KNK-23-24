package controller;

import app.Navigator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.dto.LoginUserDto;
import service.UserService;

import java.io.IOException;

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

        if(isLogin){
            Navigator.navigate(ae, Navigator.HOME_PAGE);
        }
    }

    @FXML
    private void handleCancelClick(ActionEvent ae){

    }


    @FXML
    public void handleCreateAccountClick(MouseEvent me){
        Navigator.navigate(me, Navigator.CREATE_ACCOUNT_PAGE);
    }
}
