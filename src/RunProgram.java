import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RunProgram {
    ArrayList<User> users; // laver en ny arraylist der kan indeholde alle users
    ArrayList<Movie> movies;
    ArrayList<Serie> series;

    User currentUser; //brugeren som er den nuværende bruger af programmet


    public void setup() {

        this.users = FileIO.setupUsers();
        this.movies = FileIO.setupMovies();
        this.series = FileIO.setupSeries();



    }

    public void run() throws FileNotFoundException {


         TextUI.displayLoginScreen();

         currentUser = users.get(0);


         TextUI.displayMainMenu(currentUser);


    }


}