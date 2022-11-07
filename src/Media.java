public abstract class Media
{
    protected String name;
    protected float rating;
    protected int releaseYear;
    protected String genre;


    public Media(String name, float rating, int releaseYear, String genre) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }


    public String getName() {
        return name;
    }

    public float getRating() {
        return rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Media{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", releaseYear=" + releaseYear +
                ", genre='" + genre + '\'' +
                '}';
    }
}
