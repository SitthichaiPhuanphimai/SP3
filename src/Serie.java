public class Serie extends Media
{
    private String name;
    private int episode;
    private int season;
    private float rating;

    public Serie(String name, float rating, int releaseYear, String genre, String name1, int episode, int season, float rating1) {
        super(name, rating, releaseYear, genre);
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
