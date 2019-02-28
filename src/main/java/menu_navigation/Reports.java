package menu_navigation;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class Reports extends Fulfilling {

    private Button reports = new Button("Отчеты");
    private Image image = new Image("reports.png");
    @Override
    public void getReport() {
        System.out.println("Показывает отчеты");
    }

    @Override
    public void addList() {
        provideView(image, reports);
    }

    public Button getReports() {
        return reports;
    }
}
