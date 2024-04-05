package group_02.java_06;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader design = new FXMLLoader(
                App.class.getResource("create.fxml")
        );
        Scene scene = new Scene(design.load());
        stage.setScene(scene);
        stage.show();
    }
}
