import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RunProgram {

    ArrayList<Movie> movies;
    ArrayList<Serie> series;

    User currentUser;


    public void setup() throws FileNotFoundException {


        //Vil du gå online eller

        //hvis de vælger at gå online
        //this.movies = MediaDB.setupMovies();

        //kald den her metode hvis de går offline
        this.movies = FileIO.setupMovies();
        this.series = FileIO.setupSeries();


    }

    public void run() throws Exception {



        String name = TextUI.displayLoginScreen();

        currentUser = new User(name);


        TextUI.displayMainMenu(currentUser);


    }




}