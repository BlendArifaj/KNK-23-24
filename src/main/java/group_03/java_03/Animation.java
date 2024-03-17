package group_03.java_03;

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
//        1. Krijojm figuren:
        Shape shape = new Circle(100, 100, 100);

//        2. Kriju event-in:
//        EventHandler<ActionEvent> shapeEvent = new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
////                logic ...
//            }
//        };
//        EventHandler<ActionEvent> shapeEvent = new ShapeEventHandler(shape);
//
////        4. Krijojm KeyFrame
//        KeyFrame frame = new KeyFrame(Duration.millis(100), shapeEvent);
//
////        5. Krijojm animacionin
//        Timeline animation = new Timeline(frame);
//        animation.setCycleCount(Timeline.INDEFINITE); // -1
//        animation.play(); // stop(), pause()

        EventHandler<ActionEvent> shapeEvent = new ShapeEventHandler(shape);
        EventHandler<ActionEvent> shapeXEvent = new ShapeMoveXHandler(shape, 100, 400);

        ShapeAnimation animation = new ShapeAnimation(shape, shapeEvent);
        animation.start();

        ShapeAnimation animation1 = new ShapeAnimation(shape, shapeXEvent);
        animation1.start();

        Pane pane = new Pane(shape);
        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}

class ShapeEventHandler implements EventHandler<ActionEvent>{
    private Shape shape;
    public ShapeEventHandler(Shape shape){
        this.shape = shape;
    }

//    3. Krijojm logjiken e event-it
    public void handle(ActionEvent ae){
        Color color = new Color(
                Math.random(), Math.random(), Math.random(), 1
        );
        this.shape.setFill(color);
    }

}

class ShapeMoveXHandler implements EventHandler<ActionEvent>{
    private Shape shape;
    private int minX;
    private int maxX;
    private int stepX;
    private int stepY;

    public ShapeMoveXHandler(Shape shape, int minX, int maxX){
        this.shape = shape;
        this.minX = minX;
        this.maxX = maxX;
        this.step = 1;
    }

    public void handle(ActionEvent ae){
        int translateX = (int) this.shape.getTranslateX();
        if(translateX >= this.maxX){
            this.step = -1;
        }
        if(translateX <= this.minX){
            this.step = 1;
        }

        this.shape.setTranslateX(translateX + this.step);
    }

}

class ShapeAnimation {
    private Shape shape;
    private EventHandler<ActionEvent> event;
    private Timeline animation;

    public ShapeAnimation(Shape shape, EventHandler<ActionEvent> event){
        this.shape = shape;
        this.event = event;
        this.initAnimation();
    }

    private void initAnimation(){
        KeyFrame frame = new KeyFrame(Duration.millis(100), this.event);
        this.animation = new Timeline(frame);
        this.animation.setCycleCount(Timeline.INDEFINITE);
    }

    public void start(){
        this.animation.play();
    }

    public void stop(){
        this.animation.stop();
    }
}












