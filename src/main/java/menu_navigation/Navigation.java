package menu_navigation;

import home.Establishing;
import javafx.geometry.Insets;

import java.util.Arrays;
import java.util.List;

public class Navigation implements Establishing {

    private TotalExpenditure totalExpenditure = new TotalExpenditure();
    private Income income = new Income();

    public void getMenuNavigation(){

        List<Fulfilling> list = Arrays.asList(totalExpenditure, income);

        for (Fulfilling f : list){
            f.addList();
        }

        MENU_NAVIGATION.getChildren().addAll(totalExpenditure.getTotalExpenditure(),
                income.getIncome());
        MENU_NAVIGATION.setSpacing(2);
        ROOT.getChildren().add(MENU_NAVIGATION);
    }
}
