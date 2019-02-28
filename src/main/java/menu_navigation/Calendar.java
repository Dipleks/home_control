package menu_navigation;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class Calendar extends Fulfilling {

    private Button calendar = new Button("Календарь");
    private Image image = new Image("calendar.png");
    @Override
    public void getReport() {
        System.out.println("Показывает календарь");
    }

    @Override
    public void addList() {
        provideView(image, calendar);
    }

    public Button getCalendar() {
        return calendar;
    }
}
