package title;

import javafx.application.Application;
import javafx.stage.Stage;

public class UserTitle extends Application {
    
    @Override
    public void start(Stage window) {
        Parameters params = getParameters();
        String userInput = params.getNamed().get("overrideMe");
        
        window.setTitle(userInput);
        window.show();
    }
    
}
