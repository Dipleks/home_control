package menu_navigation;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

/**
 * Класс предоставляющий таблицу долгов.
 * */
public class Arrears extends Fulfilling {

    /** Кнопка вызова таблицы долгов. */
    private Button arrears = new Button("Долги");

    /** Внешний вид кнопки. */
    private Image image = new Image("arrears.png");

    @Override
    public void getReport() {
        Fulfilling.clear();
        System.out.println("Показывает таблицу долгов");
    }

    @Override
    public void addList() {
        provideView(image, arrears);
    }

    Button getArrears() {
        return arrears;
    }
}
