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

    /** Рабочее окно. */
    Stage WINDOW = new Stage();

    /** Разрешение монитора. */
    Screen SCREEN = Screen.getPrimary();

    /** Ширина монитора. */
    double WIDTH_SIZE = SCREEN.getBounds().getWidth();

    /** Высота монитора. */
    double HEIGHT_SIZE = SCREEN.getBounds().getHeight();

    /** Главная рабочая область. */
    Group ROOT = new Group();

    /** Рабочая область таблиц. */
    Group ROOT_TABLE = new Group();

    /** Окно с рабочими областями. */
    Scene SCENE_ROOT = new Scene(ROOT, WIDTH_SIZE *0.95, HEIGHT_SIZE*0.95);

    /** Панель для объединения кнопок навигации. */
    HBox MENU_NAVIGATION = new HBox();


    default void getRootTable(){
//        ROOT_TABLE.prefHeight(100);
//        ROOT_TABLE.prefWidth(100);
//        ROOT_TABLE.getChildren().addAll(new Label("Тут будут отображены таблицы"));
        ROOT_TABLE.setLayoutX(WIDTH_SIZE/40);
        ROOT_TABLE.setLayoutY(HEIGHT_SIZE/6);
//        ROOT_TABLE.setStyle("-fx-border-color: RED");
        ROOT.getChildren().addAll(ROOT_TABLE);
    }
}
