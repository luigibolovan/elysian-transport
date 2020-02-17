package com.elysian.transport.ui;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    private double posX;
    private double posY;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("broker.fxml"));
        primaryStage.getIcons().add(new Image("/res/truck.png"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setTitle("Broker Transport");
        primaryStage.setScene(new Scene(root, 859, 400));
        primaryStage.show();

        root.setOnMousePressed(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent mouseEvent) {
                posX = mouseEvent.getSceneX();
                posY = mouseEvent.getSceneY();
            }
        });

        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                primaryStage.setX(mouseEvent.getScreenX() - posX);
                primaryStage.setY(mouseEvent.getScreenY() - posY);
            }
        });
    }
}
