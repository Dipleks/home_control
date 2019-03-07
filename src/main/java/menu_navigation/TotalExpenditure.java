package menu_navigation;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class TotalExpenditure extends Fulfilling {

    /** Кнопка вызова таблицы бюджета. */
    private Button totalExpenditure = new Button("Бюджет");

    /** Внешний вид кнопки. */
    private Image image = new Image("totalExpenditure.png");

    @Override
    public void getReport() {
        Fulfilling.clear();
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
