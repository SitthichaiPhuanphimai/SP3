public class Movie extends Media
{
    private String name;
    private int rating;
    private boolean hasWatched;

    public Movie(String name, int rating, boolean hasWatched)
    {
        this.name = name;
        this.rating = rating;
        this.hasWatched = hasWatched;
    }


    public static String getName()
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

    @Override
    public String toString() {
        return
               '\n'+ "Name= " + name + '\n' +
                ", Rating= " + rating + '\n'+
                ", HasWatched= " + hasWatched;
    }
}
