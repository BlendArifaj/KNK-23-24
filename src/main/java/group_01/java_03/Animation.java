package group_01.java_03;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application {
    public void start(Stage stage){
//        1. Krijojm figuren
        Circle circle = new Circle(100, 100, 100);

//        2. Krijojm event-in
//        EventHandler<ActionEvent> circleEvent = new EventHandler<ActionEvent>(){
////      3. Logjika e event-it
//                    public void handle(ActionEvent ae){
//                        circle.setFill(
//                                new Color(
//                                        Math.random(), Math.random(), Math.random(), 1
//                                )
//                        );
//                    }
//                };
//
//        EventHandler<ActionEvent> circleEvent = new CircleColorEventHandler(circle);
//        //    4. shkaktojm event-in ne menyre periodike
//        KeyFrame frame = new KeyFrame(
//                Duration.millis(10), circleEvent
//        );
//        // 5. Krijojm animacionin
//        Timeline animation = new Timeline(frame);
//        animation.setCycleCount(Timeline.INDEFINITE);
//        animation.play();
        ShapeColorAnimation animation1 = new ShapeColorAnimation(circle);
        ShapeXAnimation animation2 = new ShapeXAnimation(circle);
        animation1.start();
        animation2.start();

        Pane pane = new Pane(circle);
        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}

class CircleColorEventHandler implements EventHandler<ActionEvent>{
    private Shape shape;
    public CircleColorEventHandler(Shape shape){
        this.shape = shape;
    }
    public void handle(ActionEvent ae){
        Color color = new Color(
                Math.random(), Math.random(), Math.random(), 1
        );
        this.shape.setFill(color);
    }
}

class ShapeColorAnimation {
    private Shape shape;
    private EventHandler<ActionEvent> event;
    private KeyFrame frame;
    private Timeline animation;
    public ShapeColorAnimation(Shape shape){
        this.shape = shape;
        this.event = new CircleColorEventHandler(this.shape);
        this.frame = new KeyFrame(Duration.millis(10), this.event);
        this.animation = new Timeline(this.frame);
        this.animation.setCycleCount(Timeline.INDEFINITE);
    }
    public void start(){
        this.animation.play();
    }
}


class CircleXEventHandler implements EventHandler<ActionEvent>{
    private Shape shape;
    private int minX;
    private int maxX;
    private int stepX;
    private int stepY;
    public CircleXEventHandler(Shape shape, int minX, int maxX){
        this.shape = shape;
        this.minX = minX;
        this.maxX = maxX;
        this.stepX = 1;
        this.stepY = 0;
    }
    public void handle(ActionEvent ae){
        double translateX = this.shape.getTranslateX();
        double translateY = this.shape.getTranslateY();

        if(translateX <= this.minX && translateY <= this.minX){
            this.stepX = 1;
            this.stepY = 0;
        }

        if(translateX >= this.maxX && translateY <= this.minX){
            this.stepX = 0;
            this.stepY = 1;
        }

        if(translateX >= this.maxX && translateY >= this.maxX){
            this.stepX = -1;
            this.stepY = -1;
        }

        this.shape.setTranslateX(translateX + this.stepX);
        this.shape.setTranslateY(translateY + this.stepY);
    }
}

class ShapeXAnimation{
    private Shape shape;
    private EventHandler<ActionEvent> event;
    private KeyFrame frame;
    private Timeline animation;

    public ShapeXAnimation(Shape shape){
        this.shape = shape;
        this.event = new CircleXEventHandler(this.shape, 100, 400);
        this.frame = new KeyFrame(Duration.millis(10), this.event);
        this.animation = new Timeline(this.frame);
        this.animation.setCycleCount(Timeline.INDEFINITE);
    }

    public void start(){
        this.animation.play();
    }
}