package tables.income;

import home.Establishing;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * Класс предоставляющий таблицу доходов.
 * */
public class IncomeTable implements Establishing {

    /** Таблица доходов. */
    private TableView<LayoutTable> income = new TableView<>();

    /** Колонка с назаванием источника получения прибыли. */
    private TableColumn<LayoutTable, String> name = new TableColumn<>("Наименование");

    /** Колонка с суммой прибыли. */
    private TableColumn<LayoutTable, Double> sum = new TableColumn<>("Сумма");

    /** Колонка с датой зачисления прибыли. */
    private TableColumn<LayoutTable, String> date = new TableColumn<>("Дата зачисления");

    /** Колонка с заметками. */
    private TableColumn<LayoutTable, String> notes = new TableColumn<>("Заметки");

    /**
     * Функция получения таблицы и вывода её в графический интерфейс.
     * */
    public void getIncomeTable(){

        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        name.setPrefWidth(WIDTH_SIZE/12);
        sum.setCellValueFactory(new PropertyValueFactory<>("sum"));
        sum.setPrefWidth(WIDTH_SIZE/15);
        date.setCellValueFactory(new PropertyValueFactory<>("date"));
        date.setPrefWidth(WIDTH_SIZE/12);
        notes.setCellValueFactory(new PropertyValueFactory<>("notes"));
        notes.setPrefWidth(WIDTH_SIZE/3);

        income.setLayoutX(WIDTH_SIZE/20);
        income.setPrefSize(name.getWidth()+sum.getWidth()+date.getWidth()+notes.getWidth()+20,
                HEIGHT_SIZE/1.5);
        income.setStyle("-fx-font-size: 12pt");

        ObservableList<LayoutTable> list = getList();
        income.setItems(list);

        income.getColumns().addAll(name, sum, date, notes);

        ROOT_TABLE.getChildren().addAll(income);

    }

    /**
     * Функция добавления данных из базы данных.
     * @return list - список полученый из БД.
     */
    private ObservableList<LayoutTable> getList(){

        //TODO данный метод будет принимать метод который получает информацию из базы данных;

        //Тестовые данные:
        LayoutTable l1 = new LayoutTable("Зарплата", 100_000.00, "12-06-2019 12:30", "Зарплата Денис");
        LayoutTable l2 = new LayoutTable("Зарплата", 50_000.00, "12-06-2019 12:30", "Зарплата Кристина");
        LayoutTable l3 = new LayoutTable("Перевод", 20_000.00, "12-06-2019 12:30", "Перевод от мамы");
        LayoutTable l4 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l5 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l6 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l7 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l8 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l9 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l10 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l11 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l12 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l13 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l14 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l15 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l16 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l17 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l18 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l19 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l20 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l21 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l22 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l23 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l24 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l25 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l26 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l27 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l28 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l29 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");
        LayoutTable l30 = new LayoutTable("Вклад", 100_000.00, "12-06-2019 12:30", "Доход от вклада");

        ObservableList<LayoutTable> list = FXCollections.observableArrayList(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10,
                l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30);

        return list;
    }

}
