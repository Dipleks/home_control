package menu_navigation;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

/**
 * Класс предоставляющий таблицу отчетов по расходам/доходам.
 * */
public class Reports extends Fulfilling {

    /** Кнопка вызова таблицы с отчетами. */
    private Button reports = new Button("Отчеты");

    /** Внешний вид кнопки. */
    private Image image = new Image("reports.png");


    @Override
    public void getReport() {
        Fulfilling.clear();
        System.out.println("Показывает отчеты");
    }

    @Override
    public void addList() {
        provideView(image, reports);
    }

    Button getReports() {
        return reports;
    }
}
