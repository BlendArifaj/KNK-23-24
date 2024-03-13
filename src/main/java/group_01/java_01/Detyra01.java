package group_01.java_01;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Detyra01 extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        //Nyje - Node
        Node node = new Text(100, 100, "Programi i pare ne JavaFX!");
//        Text text = new Text(100, 100, "Programi i pare ne JavaFX!");
        Pane pane = new Pane(node);

//        pane.getChildren().add(node);
        Scene scene = new Scene(pane, 500, 500);

        stage.setScene(scene);
        stage.show();
    }
}
