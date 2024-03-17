package group_02.java_03;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application {
    public void start(Stage stage){
//      1. Krijojm figuren
//      2. Krijojm event-in
//      3. Krijojm logjiken (metoden) per ekzekutim
//      4. Mundesojme event-in te shkaktohet ne menyre periodike
//      5. Fillojm animacionin

//        1.
        Circle circle = new Circle(100, 100, 100);
//        2.
//        EventHandler<ActionEvent> circleEvent = new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
////                  3.
//                circle.setFill(
//                        new Color(Math.random(), Math.random(), Math.random(), 1)
//                );
//            }
//        };
//        EventHandler<ActionEvent> circleEvent = new ShapeColorEventHandler(circle);
//        4.
//        KeyFrame circleFrame = new KeyFrame(Duration.millis(100), circleEvent);

//        5.
//        Timeline animation = new Timeline(circleFrame);
//        animation.setCycleCount(Timeline.INDEFINITE);
//        animation.play();

        ShapeColorAnimation animation = new ShapeColorAnimation(circle);
        animation.start();

//        ShapeColorAnimation animation1 = new ShapeColorAnimation(rect);
//        animation1.start();


        Pane pane = new Pane(circle);
        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}

class ShapeColorEventHandler implements EventHandler<ActionEvent>{
    private Shape shape;
    private int maxLength;
    private int maxHight;

    public ShapeColorEventHandler(Shape shape){
        this.shape = shape;
    }

    public void handle(ActionEvent ae){
        this.shape.setFill(
                new Color(
                        Math.random(), Math.random(), Math.random(), 1
                )
        );
    }
}

class ShapeColorAnimation{
    private Shape shape;
    private KeyFrame shapeFrame;
    private EventHandler<ActionEvent> shapeEvent;
    private Timeline animation;

    public ShapeColorAnimation(Shape shape){
        this.shape = shape;
        this.initAnimation();
    }
    private void initAnimation(){
        this.shapeEvent = new CircleEventHandler((Circle) this.shape, 200, 300);
        this.shapeFrame = new KeyFrame(Duration.millis(10), this.shapeEvent);
        this.animation = new Timeline(this.shapeFrame);
        this.animation.setCycleCount(Timeline.INDEFINITE);
    }
    public void start(){
        this.animation.play();
    }

}

class CircleEventHandler implements EventHandler<ActionEvent>{
    private Circle circle;
    private int maxX;
    private int minX;
    private int step;

    public CircleEventHandler(Circle circle, int minX, int maxX){
        this.circle = circle;
        this.minX = minX;
        this.maxX = maxX;
        this.step = 1;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        double centerX = this.circle.getTranslateX(); // MaxX
        if (centerX >= this.maxX){
            this.step = -1;
        }

        if(centerX <= this.minX){
            this.step = 1;
        }

//        this.circle.setCenterX(centerX + this.step);
        this.circle.setTranslateX(this.circle.getTranslateX() + this.step);
    }
}

class CircleAnimation{

}

