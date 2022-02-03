package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(JokeApplication.class);
        
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Button firstButton = new Button("Joke");
        Button secondButton = new Button("Answer");
        Button thirdButton = new Button("Explanation");
        
        BorderPane layout = new BorderPane();
        HBox mainView = new HBox(35);
        mainView.setPadding(new Insets(20, 20, 20, 20));
        mainView.getChildren().addAll(firstButton, secondButton, thirdButton);
        
        StackPane firstLayout = createView("What do you call a bear with no teeth?");
        StackPane secondLayout = createView("A gummy bear.");
        StackPane thirdLayout = createView("FBI OPEN UP");
        
        firstButton.setOnAction((event) -> layout.setCenter(firstLayout));
        secondButton.setOnAction((event) -> layout.setCenter(secondLayout));
        thirdButton.setOnAction((event) -> layout.setCenter(thirdLayout));
        
        layout.setTop(mainView);
        layout.setCenter(firstLayout);
        
        Scene mainScene = new Scene(layout);
        
        stage.setScene(mainScene);
        stage.show();
        
    }
    
    private StackPane createView(String text) {
        
        StackPane layout = new StackPane();
        layout.setPadding(new Insets(30, 30, 30, 30));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().add(new Label(text));
        
        return layout;
    }
}
