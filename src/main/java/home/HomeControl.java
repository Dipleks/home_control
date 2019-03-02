package home;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import menu_bar.MenuBars;
import menu_navigation.Navigation;

public class HomeControl extends Application implements Establishing {

    public void start(Stage primaryStage) throws Exception {
        primaryStage = WINDOW;
        Navigation navigation = new Navigation();
        navigation.getMenuNavigation();

        MenuBars menu = new MenuBars();
        menu.menuBar();

        getRootTable();

        WINDOW.setTitle("Домашний контроль");
        WINDOW.setMaximized(true);
        WINDOW.setScene(SCENE_ROOT);
        WINDOW.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
