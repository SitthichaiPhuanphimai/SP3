import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class User implements MainMenu, MediaFunctions{

    private String userName;
    private String password;



    public User(String userName) {

        this.userName = userName;




    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void search() throws FileNotFoundException {


        Scanner scan = new Scanner(System.in);
        System.out.println("Type in your search: ");

        String search = scan.nextLine();


    }



    @Override
    public void displayMyWatced() {

        System.out.println(FileIO.readMyWatched(this.getUserName()));

    }

    @Override
    public void displayMySaved() {

        System.out.println(FileIO.readMyList(this.getUserName()));
    }

    @Override
    public void play(Media media) {


        System.out.println(media + "is now playing");



    }




    @Override
    public String toString() {
        return "userName='" + userName + '\'' +
                ", password='" + password + '\'';
    }
}
