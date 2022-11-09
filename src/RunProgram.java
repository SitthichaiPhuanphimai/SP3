import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RunProgram {
    ArrayList<User> users; // laver en ny arraylist der kan indeholde alle users
    ArrayList<Movie> movies;
    User currentuser; //brugeren som er den nuværende bruger af programmet



    public  void run() throws FileNotFoundException {

        this.users = FileIO.setupUsers();
        this.movies = FileIO.setupMovies();
        currentuser = users.get(0);


        TextUI.displayLoginScreen();

        TextUI.displayMainMenu(currentuser);






















    }




}
