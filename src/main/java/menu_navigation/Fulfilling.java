package menu_navigation;

import home.Establishing;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.*;

/**
 * Абстрактный класс описывающий общий вид всех кнопок меню навигации и
 * передаставляющий метод определяющий действия которые будут выполнены при
 * нажатии кнопки.
 * @author Загороднев Д.М.
 * */
public abstract class Fulfilling implements Establishing {

    /**
     * Функция определяющая действия при нажатии на кнопку.
     * */
    public abstract void getReport();

    /**
     * Функция определяющая какая кнопка будет добавлена в метод provideView
     * */
    public abstract void addList();

    /**
     * Функция опредялющая внешний кнопок меню навигации.
     * */
    Button provideView(Image image, Button button){

        button.setOnAction(e -> getReport());

        button.setPrefSize(WIDTH_SIZE/15, HEIGHT_SIZE/15);
        button.setFont(Font.font("Time New Roman", FontWeight.BOLD,
                FontPosture.ITALIC, HEIGHT_SIZE/80));
        button.graphicProperty().setValue(new ImageView(image)); // Добавляем изображение на кнопку
        button.setContentDisplay(ContentDisplay.TOP); // Размещаем надпись под изображением

        return button;
    }
}
