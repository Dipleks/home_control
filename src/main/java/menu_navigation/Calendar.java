package menu_navigation;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

/**
 * Класс предастовляющий календрь с возможность выбрать дату и построить отчет
 * по этой дате.
 * */
public class Calendar extends Fulfilling {

    /** Кнопка вызова календаря. */
    private Button calendar = new Button("Календарь");

    /** Внешний вид кнопки. */
    private Image image = new Image("calendar.png");

    @Override
    public void getReport() {
        Fulfilling.clear();
        System.out.println("Показывает календарь");
    }

    @Override
    public void addList() {
        provideView(image, calendar);
    }

    Button getCalendar() {
        return calendar;
    }
}
