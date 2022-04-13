public class Main {

    public static void main(String[] args) {
        testHoliday();
        testMovie();
    }

    private static void testHoliday() {
        Holiday[] holidays = {
                new Holiday("X-mas", 10, "January"),
                new Holiday("New-Year", 15, "January"),
                new Holiday("Sunday", 20, "January")
        };

        double average = Holiday.avgDate(holidays);
        System.out.println("average of Holiday is " + String.valueOf(average));
    }

    private static void testMovie() {
        Movie[] movies = {
                new Movie("A", "AA", "PG"),
                new Movie("B", "BB", "AB"),
                new Movie("C", "CC", "CD"),
                new Movie("D", "DD", "PG"),

        };
        Movie[] result = Movie.getPG(movies);
        System.out.println(result);
    }

}