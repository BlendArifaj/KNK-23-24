package group_03.java_02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Ushtrime1 extends Application {
    public void start(Stage stage){
//        Circle
//        Rectangle
//        Polygon
//        Polyline
//        Line
//        Arc

        Polygon polygon = new Polygon(
                0,0, 100, 100, 100, 300, 300, 200
        );
        polygon.setFill(Color.BLUE);
        polygon.setStroke(Color.RED);
        polygon.setStrokeWidth(3);
        Polyline polyline = new Polyline(
                0,0, 100, 100, 100, 300, 300, 200
        );
        polyline.setFill(Color.BLUE);
        polyline.setStroke(Color.RED);
        polyline.setStrokeWidth(3);

        Line line = new Line(0,0, 250, 250);
        line.setStroke(Color.GREEN);
        line.setRotate(90);

        Arc arc = new Arc(
                250, 250, 100, 100, 0, 50
        );
//        arc.setCenterX();
//        arc.setCenterY();
//        arc.setRadiusX();
//        arc.setRadiusY();
//        arc.setStartAngle();
//        arc.setLength();
        arc.setStroke(Color.GREEN);
        arc.setFill(Color.GRAY);
        arc.setStrokeWidth(5);
        arc.setType(ArcType.ROUND);


        Pane pane = new Pane(arc);
//        pane.getChildren().add(polygon)
        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}
