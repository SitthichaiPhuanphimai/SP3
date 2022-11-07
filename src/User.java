import java.util.ArrayList;
import java.util.Scanner;

public class User implements MainMenu, MediaFunctions{

    private String userName;
    private String password;

    private ArrayList<Media> myWatched;

    private ArrayList<Media> mySaved;

    public User(String userName, String password,ArrayList<Media>myWatched, ArrayList<Media>mySaved) {

        this.userName = userName;
        this.password = password;
        this.myWatched = myWatched;
        this.mySaved = mySaved;

    }

    @Override
    public void search() {

    }

    @Override
    public void searchAllInCat() {

    }

    @Override
    public void displayMyWatced() {

    }

    @Override
    public void displayMySaved() {


    }

    @Override
    public void play(Media media) {

        System.out.println(media + "is now playing");

    }

    @Override
    public void stop(Media media) {

        System.out.println(media + "has stopped playing");

    }

    @Override
    public void saveMovie(Media movie) {

        mySaved.add(movie);

    }

    @Override
    public void saveSeries(Media series) {

        mySaved.add(series);

    }

    @Override
    public void deleteFromSaved(Media media) {

        mySaved.remove(media);

    }
}
