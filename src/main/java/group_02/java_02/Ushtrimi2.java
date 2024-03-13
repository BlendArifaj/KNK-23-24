package group_02.java_02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ushtrimi2 extends Application {
    public void start(Stage stage){

        MyRectangle myRectangle = new MyRectangle(250, 250);
        MyCustomShape myCustomShape = new MyCustomShape(250, 350);
        Pane pane = new StackPane(myRectangle, myCustomShape);

        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}

class MyRectangle extends Pane{
    private int width;
    private int height;
    public MyRectangle(int width, int height){
        super();
        this.width = width;
        this.height = height;
        super.setMaxHeight(height);
        super.setMaxWidth(width);
        this.draw();
    }

    private void draw(){
        Rectangle rectangle = new Rectangle(0, 0, this.width, this.height);
        rectangle.setFill(null);
        rectangle.setStroke(Color.BLACK);
        Line line1 = new Line(0, 0, this.width, this.height);
        Line line2 = new Line(0, this.height, this.width, 0);
        super.getChildren().clear();
        super.getChildren().addAll(rectangle, line1, line2);
    }
}

class MyCustomShape extends Pane{
    private int width;
    private int height;
    public MyCustomShape(int width, int height){
        this.width = width;
        this.height = height;
        super.setMaxWidth(width);
        super.setMaxHeight(height);
        this.draw();
    }

    private void draw(){
        float centerX = (float) this.width / 2;
        float centerY = (float) this.height / 2;
        Polygon polygon1 = new Polygon(
                0, 0, centerX, centerY, this.width, 0
        );
        polygon1.setFill(
            this.getRandomColor()
        );

        Polygon polygon2 = new Polygon(
                this.width, 0, centerX, centerY, this.width, this.height
        );
        polygon2.setFill(
                this.getRandomColor()
        );
        Polygon polygon3 = new Polygon(
                this.width, this.height, centerX, centerY, 0, this.height
        );
        polygon3.setFill(
                this.getRandomColor()
        );
        Polygon polygon4 = new Polygon(
                0, this.height, centerX, centerY, 0, 0
        );
        polygon4.setFill(this.getRandomColor());

        super.getChildren().clear();
        super.getChildren().addAll(
                polygon1,polygon2,polygon3,polygon4
        );
    }

    private Color getRandomColor(){
        return new Color(Math.random(), Math.random(), Math.random(), 1);
    }
}












