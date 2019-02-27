package home;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * Интерфейс залающий параметры рабочей области приложения
 * */
public interface Establishing {
    Stage WINDOW = new Stage();
    Screen SCREEN = Screen.getPrimary();
    double WIDTH_SIZE = SCREEN.getBounds().getWidth();
    double HEIGHT_SIZE = SCREEN.getBounds().getHeight();
    Group ROOT = new Group();
    Scene SCENE_ROOT = new Scene(ROOT, WIDTH_SIZE *0.95, HEIGHT_SIZE*0.95);

    HBox MENU_NAVIGATION = new HBox();
}
