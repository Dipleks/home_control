package menu_navigation;

import home.Establishing;

import java.util.Arrays;
import java.util.List;

public class Navigation implements Establishing {

    private TotalExpenditure totalExpenditure = new TotalExpenditure();
    private Income income = new Income();
    private Expense expense = new Expense();
    private Translations translations = new Translations();
    private Credit credit = new Credit();
    private Arrears arrears = new Arrears();
    private Calendar calendar = new Calendar();
    private Reports reports = new Reports();

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
        MENU_NAVIGATION.setLayoutY(HEIGHT_SIZE/25);
//        MENU_NAVIGATION.setStyle("-fx-border-color: RED");
        ROOT.getChildren().add(MENU_NAVIGATION);
    }
}
