package menu_navigation;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class Income extends Fulfilling {

    private Button income = new Button("Доход");
    private Image image = new Image("income.png");

    @Override
    public void getReport() {
        System.out.println("Показывает таблицу доходов");
    }

    @Override
    public void addList(){
        provideView(image, income);
    }

    Button getIncome() {
        return income;
    }
}
