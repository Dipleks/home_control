package menu_navigation;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class TotalExpenditure extends Fulfilling {

    private Button totalExpenditure = new Button("Общие расходы");
    private Image image = new Image("totalExpenditure.png");

    @Override
    public void getReport() {
        System.out.println("Показывает таблицу общих расходов");
    }

    @Override
    public void addList(){
        provideView(image, totalExpenditure);
    }

    Button getTotalExpenditure() {
        return totalExpenditure;
    }
}
