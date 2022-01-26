package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage window) {
        Button buttonComponent = new Button("and I'm the button!");
        buttonComponent.setOnMouseClicked(event -> buttonComponent.setText("No touchy!"));
        
        Label textComponent = new Label("I'm the label");
        textComponent.setOnMouseEntered((MouseEvent e) -> {
            textComponent.setScaleX(1.2);
        });
        textComponent.setOnMouseExited((MouseEvent e) -> {
            textComponent.setScaleX(1.0);
        });

        FlowPane groupComponent = new FlowPane();
        groupComponent.getChildren().add(textComponent);
        groupComponent.getChildren().add(buttonComponent);

        Scene view = new Scene(groupComponent);

        window.setScene(view);
        window.show();
    }

}
