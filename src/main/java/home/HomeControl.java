package home;

import javafx.application.Application;
import javafx.stage.Stage;
import menu_bar.MenuBars;
import menu_navigation.Navigation;

/**
 * Главный класс вызова графического окна со всей функциональностью.
 */
public class HomeControl extends Application implements Establishing {

    /**
     * Функция вызова интерфейса программы.
     * @param primaryStage - рабочая область.
     * @throws Exception - возможная исключительная ситуация при загрузке интерфейса.
     */
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
