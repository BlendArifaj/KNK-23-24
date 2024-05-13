package app;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

import java.io.IOException;

public class Navigator {
    public final static String LOGIN_PAGE = "login_form.fxml";
    public final static String HOME_PAGE = "home.fxml";
    public final static String CREATE_ACCOUNT_PAGE = "create_user_form.fxml";

    public static void navigate(Event event, String form){
        Node eventNode = (Node) event.getSource();
        Stage stage = (Stage) eventNode.getScene().getWindow();
        navigate(stage, form);
    }

    public static void navigate(Stage stage, String form){
        Pane formPane = loadPane(form);
        Scene newScene = new Scene(formPane);
        stage.setScene(newScene);
        stage.show();
    }

    public static void navigate(Pane pane, String form){
        Pane formPane = loadPane(form);
        pane.getChildren().clear();
        pane.getChildren().add(formPane);
    }

    private void changeLanguage(){
        Locale locale = Locale.of("sq");
        Locale.setDefault(locale);
    }

    private static Pane loadPane(String form){

        ResourceBundle bundle = ResourceBundle.getBundle(
          "translations.content", Locale.getDefault()
        );
        FXMLLoader loader = new FXMLLoader(
                Navigator.class.getResource(form), bundle
        );
        try {
            return loader.load();
        }catch (IOException ioe){
            return null;
        }
    }
}
