package group_03.java_06;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader form = new FXMLLoader(
                App.class.getResource("create_user.fxml")
        );
        Scene scene = new Scene(form.load());
        stage.setScene(scene);
        stage.show();
    }
}






