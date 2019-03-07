package menu_navigation;

import tables.income.IncomeTable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;

/**
 * Класс предоставляющий таблицу доходов.
 */
public class Income extends Fulfilling {

    /** Кнопка вызова табилцы доходов. */
    private Button income = new Button("Доход");

    /** Внешний вид кнопки. */
    private Image image = new Image("income.png");

    @Override
    public void getReport() {
        Fulfilling.clear();
        IncomeTable incomeTable = new IncomeTable();
        incomeTable.getIncomeTable();
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
