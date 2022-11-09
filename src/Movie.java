public class Movie extends Media
{
    private String name;

   private int releaseYear;

   private String genre;
   private int rating;


    public Movie(String name, int releaseYear, String genre,float rating) {
        super(name, rating, releaseYear, genre);

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

    public float getRating()
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
