package home;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
    Group ROOT_TABLE = new Group();
    Scene SCENE_ROOT = new Scene(ROOT, WIDTH_SIZE *0.95, HEIGHT_SIZE*0.95);

    HBox MENU_NAVIGATION = new HBox();

    default void getRootTable(){
        ROOT_TABLE.prefHeight(100);
        ROOT_TABLE.prefWidth(100);
        ROOT_TABLE.getChildren().addAll(new Label("Тут будут отображены таблицы"));
        ROOT_TABLE.setLayoutX(WIDTH_SIZE/40);
        ROOT_TABLE.setLayoutY(HEIGHT_SIZE/6);
        ROOT_TABLE.setStyle("-fx-border-color: RED");
        ROOT.getChildren().addAll(ROOT_TABLE);
    }
}
