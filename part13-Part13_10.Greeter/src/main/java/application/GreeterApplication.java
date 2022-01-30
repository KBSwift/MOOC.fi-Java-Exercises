package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label greeting = new Label("Enter your name and start.");
        TextField name = new TextField();
        Button start = new Button("Start");

        GridPane firstLayout = new GridPane();

        firstLayout.add(greeting, 0, 0);
        firstLayout.add(name, 0, 1);
        firstLayout.add(start, 0, 2);

        firstLayout.setPrefSize(300, 200);
        firstLayout.setAlignment(Pos.CENTER);
        firstLayout.setVgap(10);
        firstLayout.setHgap(10);
        firstLayout.setPadding(new Insets(20, 20, 20, 20));

        Scene enterUsername = new Scene(firstLayout);

        Label welcomeText = new Label();

        StackPane welcome = new StackPane();
        welcome.setPrefSize(300, 200);
        welcome.setAlignment(Pos.CENTER);
        welcome.getChildren().add(welcomeText);

        Scene welcomeScreen = new Scene(welcome);

        name.textProperty().addListener((change, oldValue, newValue) -> {
            welcomeText.setText("Welcome " + newValue + "!");
        });
        
        start.setOnAction((event) -> {
            stage.setScene(welcomeScreen);
        });

        stage.setScene(enterUsername);
        stage.show();
    }

}
