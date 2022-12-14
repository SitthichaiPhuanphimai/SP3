import java.util.ArrayList;

public abstract class Media
{
    private String name;
    private float rating;
    private int releaseYear;
    private ArrayList<String> genre;


    public String getName() {
        return name;
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
