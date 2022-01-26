package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {

    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        Button button = new Button("I do nothing if pressed!");
        button.setOnMouseClicked(event -> button.setText("This is all you'll get"));
        
        TextField text = new TextField("Write stuff here");
//        text.setOnMouseClicked(event -> text.clear());
        
        FlowPane layout = new FlowPane();
        layout.setHgap(8);
        layout.getChildren().add(button);
        layout.getChildren().add(text);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
        
    }

}
