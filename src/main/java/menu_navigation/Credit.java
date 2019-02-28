package menu_navigation;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class Credit extends Fulfilling {

    private Button credit = new Button("Кредиты");
    private Image image = new Image("credit.png");
    @Override
    public void getReport() {
        System.out.println("Показывает таблицу кредитов");
    }

    @Override
    public void addList() {
        provideView(image, credit);
    }

    public Button getCredit() {
        return credit;
    }
}
