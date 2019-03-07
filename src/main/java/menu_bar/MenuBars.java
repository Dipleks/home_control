package menu_bar;

import home.Establishing;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

/**
 * Класс меню-бара.
 */
public class MenuBars implements Establishing {

    private MenuBar menuBar = new MenuBar();

    private Menu menu = new Menu("Файл");

    private MenuItem open = new MenuItem("Открыть");

    public void menuBar(){
        menu.getItems().addAll(open);
        menuBar.getMenus().addAll(menu);
        menuBar.setPrefWidth(WIDTH_SIZE);
        ROOT.getChildren().add(menuBar);
    }
}
