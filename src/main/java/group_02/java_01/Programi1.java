package group_02.java_01;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Programi1 extends Application {

    public void start(Stage stage){
        // Stage
        // Scene
        // Pane
        // Items
        Node button1 = new Button("Click Me!");
        Node text1 = new Text(100, 100, "JavaFX!");

        Pane pane = new Pane();
//        pane.getChildren().add(button1);
//        pane.getChildren().add(text1);

        pane.getChildren().addAll(button1, text1);
        pane.setMaxWidth(200);
        pane.setMaxHeight(200);

        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}
