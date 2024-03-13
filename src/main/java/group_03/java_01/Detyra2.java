package group_03.java_01;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class Detyra2 extends Application {
    public void start(Stage stage){
        Shape circle = new Circle(0, 0, 50);
        Color newColor = new Color(0.3, 0.5, 0.2, 1);
        circle.setFill(newColor); // Color.RED

        Rectangle rect = new Rectangle(100, 100, 50, 100);

        Polygon polygon = new Polygon(100, 100, 200, 200, 100, 300);
        polygon.setFill(Color.BLUE);
        polygon.setStroke(Color.GREEN);
        polygon.setStrokeWidth(2);
        polygon.setRotate(90);

        Pane pane = new Pane(circle, rect, polygon);
//        pane.setMaxHeight();
//        pane.setMaxWidth();

        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}
