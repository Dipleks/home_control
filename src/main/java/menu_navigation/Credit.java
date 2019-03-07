package menu_navigation;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

/**
 * Класс предоставляющий таблицу кредитов.
 * */
public class Credit extends Fulfilling {

    /** Кнопка вызова таблицы кредиты. */
    private Button credit = new Button("Кредиты");

    /** Внешний вид кнопки. */
    private Image image = new Image("credit.png");

    @Override
    public void getReport() {
        Fulfilling.clear();
        System.out.println("Показывает таблицу кредитов");
    }

    @Override
    public void addList() {
        provideView(image, credit);
    }

    Button getCredit() {
        return credit;
    }
}
