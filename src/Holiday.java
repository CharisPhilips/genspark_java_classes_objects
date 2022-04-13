import java.util.Arrays;

public class Holiday {

    //Members
    private String name;
    private int day;
    private String month;

    //Constructor
    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    //Methods
    public static boolean inSameMonth(Holiday first, Holiday second) {
        if (first == null || second == null) {
            return false;
        }
        return first.month == second.month;
    }

    public static double avgDate(Holiday[] holidays) {
        return Arrays.stream(holidays).mapToDouble(Holiday::getDay).average().getAsDouble();
    }

    public static Holiday holiday = new Holiday("Independence Day", 4, "July");

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
