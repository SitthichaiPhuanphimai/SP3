import java.util.ArrayList;

public class Serie extends Media {
    private String name;
    private ArrayList<String> runYear;
    private ArrayList<String> genre;
    private float rating;
    ArrayList<String> ep;



    public Serie(String name, ArrayList<String> runYear, ArrayList<String> genre, float rating, ArrayList<String> ep)
    {
        this.name = name;
        this.runYear = runYear;
        this.genre = genre;
        this.rating = rating;
        this.ep = ep;
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<String> getRunYear()
    {
        return runYear;
    }

    public ArrayList<String> getGenre()
    {
        return genre;
    }

    public float getRating()
    {
        return rating;
    }

    public ArrayList<String> getEp()
    {
        return ep;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Run year: " + runYear + '\n' +
                "Genre: " + genre + '\n' +
                "Rating: " + rating + '\n'+
                "Episode: "+ ep;

    }
}










//

/*
public class Serie
{
    private String name;

    private ArrayList<String> genre;

    int runYear;
    private int episode;
    private int season;
    private float rating;

    public Serie(String name, int runYear, ArrayList<String> genre,float rating,int episode ) {
        this.name = name;
        this.runYear = runYear;
        this.rating = rating;
        this.episode = episode;


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
*/
