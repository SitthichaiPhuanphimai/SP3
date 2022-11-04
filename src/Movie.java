public class Movie extends Media
{
    private String name;

   private int releaseYear;

   private String genre;
    private int rating;


    public Movie(String name, int releaseYear, String genre, int rating)
    {
        this.name = name;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.rating = rating;



    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public String getName()
    {
        return name;
    }

    public int getRating()
    {
        return rating;
    }



    @Override
    public String toString() {
        return
               '\n'+ "Name= " + name + '\n' +
                ", Rating= " + rating + '\n';
    }
}
