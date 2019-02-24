package home;

import javafx.application.Application;
import javafx.stage.Stage;

public class HomeControl extends Application implements Establishing {

    public void start(Stage primaryStage) throws Exception {
        primaryStage = WINDOW;

        WINDOW.setTitle("Домашний контроль");
        WINDOW.setMaximized(true);
        WINDOW.setScene(SCENE_ROOT);
        WINDOW.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
