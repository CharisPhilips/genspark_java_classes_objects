import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Movie {

    public String getTitle() {
        return title;
    }

    //Members
    private String title;
    private String studio;
    private String rating;

    //Constructor
    public Movie(String title, String studio, String rating) {
        this.title =  title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this(title, studio, "PG");
    }

    //Methods
    public static Movie[] getPG(Movie[] movies) {
        Movie[] result = Arrays.stream(movies).filter(m -> m.getRating().equals("PG")).toArray(Movie[]::new);
        return result;
    }

    public static Movie movie = new Movie("Casino Royale", "Eon Productions", "PG-13");

    //Getter and Setter
    public void setTitle(String title) {
        this.title = title;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
