package group_02.java_01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Stack;
import java.util.concurrent.Flow;

public class Programi3 extends Application {

    public void start(Stage stage){
        // Pane
        // VBox, HBox, StackPane, FlowPane
        Pane pane = new FlowPane();
        for(int i = 0; i < 4; i++){
            pane.getChildren().add(
              new Circle(100, 100, 50)
            );
        }
        pane.setMaxWidth(200);
        pane.setMaxHeight(200);
        StackPane stackPane = new StackPane(pane);
        Scene scene = new Scene(stackPane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}







