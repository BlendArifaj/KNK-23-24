package group_01.java_05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                App.class.getResource("view.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load(), 600, 450);
        stage.setScene(scene);
        stage.show();
    }
}