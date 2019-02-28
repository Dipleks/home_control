package menu_navigation;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class Arrears extends Fulfilling {

    private Button arrears = new Button("Долги");
    private Image image = new Image("arrears.png");
    @Override
    public void getReport() {
        System.out.println("Показывает таблицу долгов");
    }

    @Override
    public void addList() {
        provideView(image, arrears);
    }

    public Button getArrears() {
        return arrears;
    }
}
