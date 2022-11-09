import java.io.FileNotFoundException;
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

    public String getUserName() {
        return userName;
    }

    @Override
    public void search() throws FileNotFoundException {


        Scanner scan = new Scanner(System.in);
        System.out.println("Type in your search: ");

        String search = scan.nextLine();


    }

    @Override
    public void searchAllInCat() {

    }

    @Override
    public void displayMyWatced() {

        for (Media m:myWatched) {
            System.out.println(m);
        }

    }

    @Override
    public void displayMySaved() {

        for (Media m:mySaved) {
            System.out.println(m);
        }
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
        System.out.println(movie + "has been added to your saved list");

    }

    @Override
    public void saveSeries(Media series) {

        mySaved.add(series);
        System.out.println(series + " has been added to your saved list");

    }

    @Override
    public void deleteFromSaved(Media media) {

        mySaved.remove(media);
        System.out.println(media+ "has been removed from your saved list");

    }

    @Override
    public String toString() {
        return "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", myWatched=" + myWatched +
                ", mySaved=" + mySaved;
    }
}
