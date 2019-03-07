package menu_navigation;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

/**
 * Класс предаставляющий таблицу расходы.
 */
public class Expense extends Fulfilling {

    /** Кнопка вызова таблицы расходы. */
    private Button expense = new Button("Расход");

    /** Внешний вид кнопки. */
    private Image image = new Image("expense.png");

    @Override
    public void getReport() {
        Fulfilling.clear();
        System.out.println("Показывает таблицу расходов");
    }

    @Override
    public void addList() {
        provideView(image, expense);
    }

    Button getExpense() {
        return expense;
    }
}
