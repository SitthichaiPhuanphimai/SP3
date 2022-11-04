public class Serie
{
    private String name;
    private int episode;
    private int season;
    private int rating;
    private boolean hasWatched;

    public Serie(String name, int episode, int season, int rating, boolean hasWatched)
    {
        this.name = name;
        this.episode = episode;
        this.season = season;
        this.rating = rating;
        this.hasWatched = hasWatched;
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

    public int getRating()
    {
        return rating;
    }

    public boolean isHasWatched()
    {
        return hasWatched;
    }

    @Override
    public String toString()
    {
        return "Serie{" +
                "name='" + name + '\'' +
                ", episode=" + episode +
                ", season=" + season +
                ", rating=" + rating +
                ", hasWatched=" + hasWatched +
                '}';
    }
}
