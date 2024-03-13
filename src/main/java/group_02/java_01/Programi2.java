package group_02.java_01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class Programi2 extends Application {

    @Override
    public void start(Stage stage) {
//        Shape
        Circle circle = new Circle(100, 100, 50);
//        Node circle2 = new Circle(100, 100, 50);
//        Shape circle3 = new Circle(100, 100, 50);
        Color newColor = new Color(0.5, 0.3, 0.1, 0);
        circle.setFill(Color.RED);
        circle.setStrokeWidth(10);
        circle.setStroke(Color.GREEN);

        Rectangle rect1 = new Rectangle(200, 200, 150, 200);
        rect1.setRotate(65);
        rect1.setFill(null);
        rect1.setStroke(Color.BLACK);
        rect1.setStrokeWidth(5);

        Pane pane = new Pane(circle, rect1);
//        pane.getChildren().add(circle);
//        pane.getChildren().clear();

        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();

    }
}
