import java.util.ArrayList;

public class Categories
{

    public Categories() {
    }

    private final ArrayList<Movie> movieList = new ArrayList<>();
    private final ArrayList<Serie> seriesList = new ArrayList<>();

    public void addMovie(Movie movie)
    {
        movieList.add(movie);
    }

    public void addSeries(Serie serie)
    {
        seriesList.add(serie);
    }

    @Override
    public String toString() {
        return
                "movieList=" + movieList;
    }
}
