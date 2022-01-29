package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane firstLayout = new BorderPane();
        Button firstButton = new Button("To the second view!");
        Button secondButton = new Button("To the third view!");
        Button thirdButton = new Button("To the first view!");
        
        firstLayout.setTop(new Label("First view!"));
        firstLayout.setCenter(firstButton);

        VBox secondLayout = new VBox(10);
        secondLayout.getChildren().addAll(secondButton, new Label("Second View"));
        
        GridPane thirdLayout = new GridPane();
        thirdLayout.add(new Label("Third View!"), 0, 0);
        thirdLayout.add(thirdButton, 1, 1);
        
        Scene firstScene = new Scene(firstLayout, 420, 300);
        Scene secondScene = new Scene(secondLayout, 420, 300);
        Scene thirdScene = new Scene(thirdLayout, 420, 300);
        
        firstButton.setOnAction((event) -> {
            stage.setScene(secondScene);
        });

        secondButton.setOnAction((event) -> {
            stage.setScene(thirdScene);
        });
        
        thirdButton.setOnAction((event) -> {
            stage.setScene(firstScene);
        });
        
        stage.setScene(firstScene);
        stage.show();

    }

}
