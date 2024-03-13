package group_03.java_01;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Detyra1 extends Application {

    public void start(Stage stage){
        // Stage
        // Scene
        // Pane
        // Node
        Node button1 = new Button("Click me!");
//        Button button1 = new Button("Click me!");
        Pane panel1 = new Pane(button1);
//        panel1.getChildren().add(button1);
//        panel1.getChildren().addAll(button1);
        Scene scene = new Scene(panel1, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}
