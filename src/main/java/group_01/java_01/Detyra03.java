package group_01.java_01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Detyra03 extends Application {

    @Override
    public void start(Stage stage) {
        // HBox, VBox, StackPane, FlowPane

        HBox row1 = new HBox();
        HBox row2 = new HBox();
        VBox cols = new VBox(row1, row2);
        cols.setMaxWidth(200);
        cols.setMaxHeight(200);
        StackPane pane = new StackPane(cols);

        for(int i =0; i<4; i++){
            if(i%2 == 0){
                row1.getChildren().add(
                        new Circle(20, 20, 50)
                );
            }else{
                row2.getChildren().add(
                        new Circle(20, 20, 50)
                );
            }
        }

//        Pane testPane = new FlowPane();
//        testPane.setMaxHeight(200);
//        testPane.setMaxWidth(200);
//        for(int i=0; i<4; i++){
//            testPane.getChildren().add(
//                    new Circle(20, 20, 50)
//            );
//        }
//        StackPane pane = new StackPane(testPane);
        Scene scene = new Scene(pane, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
}
