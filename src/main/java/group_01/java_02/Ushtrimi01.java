package group_01.java_02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Ushtrimi01 extends Application {

    public void start(Stage stage){
        /*
        Shape:
            - Circle
            - Rectangle
            - Polygon
            - Polyline
            - Line
            - Arc
         */
        Polygon polygon = new Polygon(0, 0, 200, 200, 200, 350, 500, 150);
        polygon.setFill(Color.GREEN);
        polygon.setStroke(Color.RED);
        polygon.setStrokeWidth(2);
        polygon.setRotate(0);

        Polyline polyline = new Polyline(0, 0, 200, 200, 200, 350, 500, 150);
//        polyline.setFill(Color.GREEN);
        polyline.setStroke(Color.RED);
        polyline.setStrokeWidth(2);
        polyline.setRotate(0);

        Line line = new Line(0,0, 200, 200);
        line.setFill(Color.GREEN);
        line.setStroke(Color.RED);
        line.setRotate(50);

        Arc arc = new Arc(
                250, 250, 200, 200, -15, 45
        );
        arc.setFill(Color.GREEN);
        arc.setType(ArcType.ROUND);
        arc.setStroke(Color.RED);

//        Custom Rectangle
//        - Rectangle
//        - 2 x Line
        CustomRect customRect = new CustomRect(500, 500);

//        Random color:
        Color randomColor = new Color(Math.random(), Math.random(), Math.random(), 1);

        CustomAdvancedRect rect2 = new CustomAdvancedRect(350, 250);

        Pane pane = new StackPane(rect2);


        Scene scene = new Scene(pane, 700, 700);
        stage.setScene(scene);
        stage.show();
    }
}

class CustomRect extends Pane{
    private int width;
    private int height;
    public CustomRect(int width, int height){
        this.width = width;
        this.height = height;
        super.setMaxWidth(this.width);
        super.setMaxHeight(this.height);
        this.draw();
    }

    private void draw(){
        Rectangle rect = new Rectangle(0, 0, this.width, this.height);
        rect.setFill(null);
        rect.setStroke(Color.BLACK);
        Line line1 = new Line(0, 0, this.width, this.height);
        Line line2 = new Line(0, this.height, this.width, 0);
        super.getChildren().clear();
        super.getChildren().addAll(rect, line1, line2);
    }
}

abstract class CustomShape extends Pane{
    protected int width;
    protected int height;

    public CustomShape(int width, int height){
        this.width = width;
        this.height = height;
        super.setMaxHeight(this.height);
        super.setMaxWidth(this.width);
    }

    abstract protected void draw();
}

class CustomAdvancedRect extends CustomShape{

    public CustomAdvancedRect(int width, int height){
        super(width, height);
        this.draw();
    }

    protected void draw(){
        double middleX = width / 2;
        double middleY = height / 2;

        Polygon polygon1 = new Polygon(
                middleX, middleY, 0, 0, width, 0
        );
        polygon1.setFill(this.getRandomColor());

        Polygon polygon2 = new Polygon(
            middleX, middleY, 0,0 , 0, height
        );
        polygon2.setFill(this.getRandomColor());

        Polygon polygon3 = new Polygon(
                middleX, middleY, 0, height, width, height
        );
        polygon3.setFill(this.getRandomColor());

        Polygon polygon4 = new Polygon(
                middleX, middleY, width, height, width, 0
        );
        polygon4.setFill(this.getRandomColor());
        super.getChildren().clear();
        super.getChildren().addAll(polygon1, polygon2, polygon3, polygon4);
    }

    private Color getRandomColor(){
        return new Color(
                Math.random(), Math.random(), Math.random(), 1
        );
    }
}