package group_01.java_04;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Detyra_01 extends Application {

    @Override
    public void start(Stage primaryStage) {
        CrossCircle shape = new CrossCircle(100);
        CrossCircleMoveEventHandler event = new CrossCircleMoveEventHandler(shape, 0, 450);
        PaneAnimation animation = new PaneAnimation(shape, event);
        animation.start();

        Pane pane = new Pane(shape);
        Scene scene = new Scene(pane, 700, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


class CrossCircle extends StackPane {
    private int radius;
    private Color color;


    public CrossCircle(int radius) {
        this.radius = radius;
        this.color = Color.BLACK;
        this.draw();
    }

    public CrossCircle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
        this.draw();
    }

    public void setColor(Color color){
        this.color = color;
        this.draw();
    }

    private void draw(){
        Circle circle1 = new Circle(0,0, this.radius);
        circle1.setFill(null);
        circle1.setStroke(this.color);

        Circle circle2 = new Circle(0,0, this.radius * 0.7);
        circle2.setFill(null);
        circle2.setStroke(this.color);


        Line line1 = new Line(0, 0, 0, 2*this.radius);
        line1.setStroke(this.color);
        Line line2 = new Line( 0, 0, 2*this.radius, 0);
        line2.setStroke(this.color);
        super.getChildren().clear();
        super.getChildren().addAll(circle1, circle2, line1, line2);
        super.setRotate(45);
    }
}


class PaneAnimation{
    private Pane shape;
    private EventHandler<ActionEvent> event;
    private KeyFrame frame;
    private Timeline animation;

    public PaneAnimation(Pane shape, EventHandler<ActionEvent> event){
        this.shape = shape;
        this.event = event;
        this.frame = new KeyFrame(Duration.millis(20), this.event);
        this.animation = new Timeline(this.frame);
        this.animation.setCycleCount(Timeline.INDEFINITE);
    }

    public void start(){
        this.animation.play();
    }
}


class CrossCircleMoveEventHandler implements EventHandler<ActionEvent>{
    private CrossCircle object;
    private double minTranslate;
    private double maxTranslate;
    private int stepX;
    private int stepY;
    private int rotate;


    public CrossCircleMoveEventHandler(CrossCircle object, double minTranslate, double maxTranslate) {
        this.object = object;
        this.minTranslate = minTranslate;
        this.maxTranslate = maxTranslate;
        this.stepX = 1;
        this.stepY = 0;
        this.rotate = 10;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        double translateX = this.object.getTranslateX();
        double translateY = this.object.getTranslateY();
        double rotate = this.object.getRotate();

        if(translateX >= this.maxTranslate && translateY <= this.minTranslate){
            this.stepX = 0;
            this.stepY = 10;
            this.rotate = 10;
            this.object.setColor(this.generateRandomColor());
        }else if(translateX >= this.maxTranslate && translateY >= this.maxTranslate){
            this.stepX = -1;
            this.stepY = 0;
            this.rotate = 1;
            this.object.setColor(this.generateRandomColor());
        }else if(translateX <= this.minTranslate && translateY >= this.maxTranslate){
            this.stepX = 0;
            this.stepY = -1;
            this.rotate = 1;
            this.object.setColor(this.generateRandomColor());
        }else if(translateX <= this.minTranslate && translateY <= this.minTranslate){
            this.stepX = 10;
            this.stepY = 0;
            this.rotate = 10;
            this.object.setColor(this.generateRandomColor());
        }
        this.object.setTranslateX(translateX + this.stepX);
        this.object.setTranslateY(translateY + this.stepY);
        this.object.setRotate(rotate + this.rotate);
    }

    private Color generateRandomColor(){
        return new Color(
                Math.random(), Math.random(), Math.random(), 1
        );
    }
}