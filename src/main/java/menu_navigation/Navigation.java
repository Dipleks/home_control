package menu_navigation;

import home.Establishing;

import java.util.Arrays;
import java.util.List;

/**
 * Класс навигации по меню, объединяет все кнопки управления в один блок управления.
 * @author Загороднев Д.М.
 * */
public class Navigation implements Establishing {

    /** Кнопка "Бюджет" */
    private TotalExpenditure totalExpenditure = new TotalExpenditure();

    /** Кнопка "Доход" */
    private Income income = new Income();

    /** Кнопка "Расход" */
    private Expense expense = new Expense();

    /** Кнопка "Переводы" */
    private Translations translations = new Translations();

    /** Кнопка "Кредиты" */
    private Credit credit = new Credit();

    /** Кнопка "Долги" */
    private Arrears arrears = new Arrears();

    /** Кнопка "Календарь" */
    private Calendar calendar = new Calendar();

    /** Кнопка "Отчеты" */
    private Reports reports = new Reports();

    /**
     * Функция объединения кнопок в панель навигации.
     * */
    public void getMenuNavigation(){

        List<Fulfilling> list = Arrays.asList(totalExpenditure, income, expense, translations,
                credit, arrears, calendar, reports);

        for (Fulfilling f : list){
            f.addList();
        }

        MENU_NAVIGATION.getChildren().addAll(totalExpenditure.getTotalExpenditure(),
                income.getIncome(), expense.getExpense(), translations.getTranslations(),
                credit.getCredit(), arrears.getArrears(), calendar.getCalendar(), reports.getReports());
        MENU_NAVIGATION.setSpacing(2); //растояние между кнопками
        MENU_NAVIGATION.setLayoutY(HEIGHT_SIZE/38);
//        MENU_NAVIGATION.setStyle("-fx-border-color: RED");
        ROOT.getChildren().add(MENU_NAVIGATION);
    }
}
