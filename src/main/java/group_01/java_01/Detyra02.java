package group_01.java_01;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class Detyra02 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Circle node1 = new Circle(0, 0, 100);
        node1.setFill(null);
        node1.setStroke(Color.BLUE);
        node1.setStrokeWidth(10);

        Shape node2 = new Rectangle(100, 100, 100, 100);
        node2.setFill(Color.RED);

        Pane pane = new Pane();
//        pane.getChildren().add(node1);
//        pane.getChildren().add(node2);
        pane.getChildren().addAll(node1, node2);

        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}
