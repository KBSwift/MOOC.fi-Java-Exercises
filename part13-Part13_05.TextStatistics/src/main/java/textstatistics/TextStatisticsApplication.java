package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
        System.out.println("Hello world!");
    }
    
    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane(new TextArea(""));
        
        HBox textComponent = new HBox(20);
        textComponent.getChildren().addAll
        (new Label("Letters: 0"), new Label("Words: 0"), new Label("The longest word is:"));
        layout.setBottom(textComponent);
        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();
    }

}
