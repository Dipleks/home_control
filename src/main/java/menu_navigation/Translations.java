package menu_navigation;

import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class Translations extends Fulfilling {

    private Button translations = new Button("Переводы");
    private Image image = new Image("translations.png");
    @Override
    public void getReport() {
        System.out.println("Показывает таблицу переводов");
    }

    @Override
    public void addList() {
        provideView(image, translations);
    }

    public Button getTranslations() {
        return translations;
    }
}
