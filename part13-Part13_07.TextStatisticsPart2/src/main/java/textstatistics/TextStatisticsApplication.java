package textstatistics;

import java.util.Arrays;
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

    public void start(Stage stage) throws Exception {
        
        TextArea userText = new TextArea();
        BorderPane layout = new BorderPane(userText);

        HBox textComponent = new HBox(20);

        Label letters = new Label("Letters: 0");
        Label wordsTyped = new Label("Words: 0");
        Label longestWord = new Label("The longest word is: ");
        textComponent.getChildren().addAll(letters, wordsTyped, longestWord);
        layout.setBottom(textComponent);
        
        userText.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
//            System.out.println(change);
//            System.out.println(oldValue);
            wordsTyped.setText("Words: " + words);
            longestWord.setText("The longest word is: " + longest);
            letters.setText("Letters: " + characters);
            
        });

        Scene view = new Scene(layout);
        stage.setScene(view);
        stage.show();
    }
}
