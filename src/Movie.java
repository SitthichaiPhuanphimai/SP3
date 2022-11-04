public class Movie extends Media
{
    private String name;
    private String genre;
    private int rating;
    private boolean hasWatched;
    private int releaseYear;

    public String getGenre()
    {
        return genre;
    }

    public Movie(String name, int releaseYear, String genre, int rating )
    {
        this.name = name;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.rating = rating;
        //this.hasWatched = hasWatched;
    }



    public String getName()
    {
        return name;
    }

    public int getRating()
    {
        return rating;
    }

    public boolean isHasWatched()
    {
        return hasWatched;
    }

    public int getReleaseYear()
    {
        return releaseYear;
    }

}
