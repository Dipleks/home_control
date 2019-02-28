package menu_navigation;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class Expense extends Fulfilling {

    private Button expense = new Button("Расход");
    private Image image = new Image("expense.png");

    @Override
    public void getReport() {
        System.out.println("Показывает таблицу расходов");
    }

    @Override
    public void addList() {
        provideView(image, expense);
    }

    public Button getExpense() {
        return expense;
    }
}
