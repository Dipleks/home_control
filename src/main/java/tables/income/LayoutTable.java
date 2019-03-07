package tables.income;

/**
 * Класс предастовляющий макет таблицы.
 * */
public class LayoutTable {

    /** Наименование расхода/дохода */
    private String name;

    /** сумма дохода/расхода */
    private double sum;

    /** Дата зачисления/расхода */
    private String date;

    /** Заметки */
    private String notes;

    /**
     * Конструктор задающий вид таблицы.
     * */
    public LayoutTable(String name, double sum, String date, String notes) {
        this.name = name;
        this.sum = sum;
        this.date = date;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "LayoutTable{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                ", date='" + date + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
