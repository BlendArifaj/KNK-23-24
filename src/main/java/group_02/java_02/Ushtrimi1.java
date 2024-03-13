package group_02.java_02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Ushtrimi1 extends Application {

    public void start(Stage stage){
        // Circle
        // Rectangle
        // Polygon
        // Polyline
        // Line
        // Arc
        Polygon polygon = new Polygon(
                0,0, 100, 100, 200, 350, 300, 120
        );
        polygon.setFill(Color.RED);
        polygon.setStroke(Color.GREEN);
        polygon.setStrokeWidth(2);

        Polyline polyline = new Polyline(
                0,0, 100, 100, 200, 350, 300, 120
        );
        polyline.setFill(Color.RED);
        polyline.setStroke(Color.GREEN);
        polyline.setStrokeWidth(2);

        Line line = new Line(
                0,0, 250, 250
        );
        line.setStroke(Color.BLUE);
        line.setFill(Color.RED);
        line.setRotate(45);

        Arc arc = new Arc(
           250, 250, 150, 150, 0, 50
        );
        arc.setStroke(Color.BLUE);
        arc.setFill(null);
        arc.setStrokeWidth(2);
        arc.setType(ArcType.ROUND);

        Pane pane = new Pane(arc);

        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

}









