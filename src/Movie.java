import java.util.ArrayList;

public class Movie extends Media
{
    private String name;

   private int releaseYear;

   private ArrayList<String> genre;
   private float rating;


    public Movie(String name, int releaseYear, ArrayList<String> genre, float rating) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.rating = rating;

    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public String getName()
    {
        return name;
    }

    public float getRating()
    {
        return rating;
    }



}
