import java.util.ArrayList;

public class Serie
{
    private String name;

    private ArrayList<String> genre;

    int releaseYear;
    private int episode;
    private int season;
    private float rating;

    public Serie(String name, float rating, int releaseYear, ArrayList<String> genre, String name1, int episode, int season, float rating1) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
        this.episode = episode;
        this.season = season;

    }

    public String getName()
    {
        return name;
    }

    public int getEpisode()
    {
        return episode;
    }

    public int getSeason()
    {
        return season;
    }

    public float getRating()
    {
        return rating;
    }


    @Override
    public String toString()
    {
        return "Serie{" +
                "name='" + name + '\'' +
                ", episode=" + episode +
                ", season=" + season +
                ", rating=" + rating;
    }
}
