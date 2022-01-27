package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(NotifierApplication.class);
        System.out.println("Hello world!");
    }
    
    public void start(Stage stage) {
        VBox layout = new VBox(5);
        TextField userText = new TextField("");
        Button button = new Button("Update");
        button.setDefaultButton(true);
        Label bottomText = new Label();
        button.setOnAction((event) -> {
            bottomText.setText(userText.getText());
        });
        
        layout.getChildren().addAll(userText, button, bottomText);
        
        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
    }

}
