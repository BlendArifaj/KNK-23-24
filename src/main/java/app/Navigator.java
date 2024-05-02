package app;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigator {
    public final static String LOGIN_PAGE = "login_form.fxml";
    public final static String HOME_PAGE = "home.fxml";
    public final static String CREATE_ACCOUNT_PAGE = "create_user_form.fxml";

    public static void navigate(Event event, String form){
//        Navigate -> event -> from current scene to next scene
        Node eventNode = (Node) event.getSource();
        Stage stage = (Stage) eventNode.getScene().getWindow();
        navigate(stage, form);
    }

    public static void navigate(Stage stage, String form){
        FXMLLoader loader = new FXMLLoader(
                Navigator.class.getResource(form)
        );
        try{
            Scene newScene = new Scene(loader.load());
            stage.setScene(newScene);
            stage.show();
        }catch (IOException ioe){

        }
    }

}
