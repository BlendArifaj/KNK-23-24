package group_03.java_02;

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
//        int x = 100;
//        int y = 100;
//        int width = 350;
//        int height = 250;
//        Rectangle rectangle = new Rectangle(
//                x, y, width, height
//        );
//        rectangle.setFill(null);
//        rectangle.setStroke(Color.BLACK);
//
//        Line line1 = new Line(
//                x, y, x + width, y+height
//        );
//        Line line2 = new Line(
//                x+width, y, x, y + height
//        );

        Color randomColor = new Color(
                Math.random(), Math.random(), Math.random(), 1
        );
        MyCustomRect rect = new MyCustomRect(350, 250);
        MyCustomRect2 rect2 = new MyCustomRect2(350, 250);

        Pane pane = new StackPane(rect2);
        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

}
class MyCustomRect extends Pane{
    private int width;
    private int height;
    public MyCustomRect(int width, int height){
        this.width = width;
        this.height = height;
        super.setMaxWidth(width);
        super.setMaxHeight(height);
        this.draw();
    }
    private void draw(){
        Rectangle rect = new Rectangle(0, 0, width, height);
        rect.setFill(null);
        rect.setStroke(Color.BLACK);
        Line line1 = new Line(0,0, width, height);
        Line line2 = new Line(width, 0, 0, height);
        super.getChildren().clear();
        super.getChildren().addAll(rect, line1, line2);
    }
}


class MyCustomRect2 extends Pane{
    private int width;
    private int height;
    public MyCustomRect2(int width, int height){
        this.width = width;
        this.height = height;
        super.setMaxHeight(height);
        super.setMaxWidth(width);
        this.draw();
    }

    private void draw(){
        float centerX = this.width / 2;
        float centerY = this.height / 2;
        Polygon polygon1 = new Polygon(
                0, 0, centerX, centerY, 0, height
        );
        polygon1.setFill(this.randomColor());
        Polygon polygon2 = new Polygon(
                0, 0, centerX, centerY, width, 0
        );
        polygon2.setFill(this.randomColor());
        Polygon polygon3 = new Polygon(
                width, height, centerX, centerY, 0, height
        );
        polygon3.setFill(this.randomColor());
        Polygon polygon4 = new Polygon(
                width, height, centerX, centerY, width, 0
        );
        polygon4.setFill(this.randomColor());
        super.getChildren().addAll(polygon1, polygon2, polygon3, polygon4);

    }

    private Color randomColor(){
        return new Color(Math.random(), Math.random(), Math.random(),1);
    }
}








