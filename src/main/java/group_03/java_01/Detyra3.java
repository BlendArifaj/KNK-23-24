package group_03.java_01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Detyra3 extends Application {
    // Pane
    // VBox, HBox, StackPane, FlowPane
    public void start(Stage stage){
        FlowPane flowPane = new FlowPane();
        for(int i = 0; i < 4; i++){
            Rectangle rect = new Rectangle(100, 100, 50, 50);
            rect.setRotate(45);
            flowPane.getChildren().add(rect);
        }
        flowPane.setMaxWidth(100);
        flowPane.setMaxHeight(100);

        Pane pane = new StackPane(flowPane);
        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}
