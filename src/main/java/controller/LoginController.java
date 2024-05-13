package controller;

import app.Navigator;
import app.SessionManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.User;
import model.dto.LoginUserDto;
import service.UserService;

import java.util.Locale;

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
//        User user = UserService.login(loginUserData);
//        if(user != null){
//            SessionManager.setUser(user);
//            Navigator.navigate(ae, Navigator.HOME_PAGE);
//        }

    }

    @FXML
    private void handleCancelClick(ActionEvent ae){
        Locale locale = Locale.of("de");
        Locale.setDefault(locale);
        Locale.setDefault(new Locale("de", "DE")); // set default locale to German
    }

    @FXML
    private void handleCreateAccountClick(MouseEvent me){
        Navigator.navigate(me, Navigator.CREATE_ACCOUNT_PAGE);
    }


    @FXML
    private void handleLanguageClick(ActionEvent ae){
        Locale defaultLocale = Locale.getDefault();
        if(defaultLocale.getLanguage().equals("sq")){

        }else{

        }
    }

}
