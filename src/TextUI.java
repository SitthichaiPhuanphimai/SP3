import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.awt.Event.ENTER;

public class TextUI{

   static ArrayList<Movie> movies = FileIO.setupMovies();

        public static void displayLoginScreen()throws FileNotFoundException{

            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to start menu");
            System.out.println("Chose your option");
            System.out.println("- Login");
            System.out.println("- Create user");

            String userInput = scan.nextLine();


            if (userInput.equalsIgnoreCase("login")) {

                UserLogin.login();
            }

            if (userInput.equalsIgnoreCase("create user"))
            {

                CreateUser.createUser();

            }




        }

        public static void mediaFunctions(Media media,User currentUser) throws FileNotFoundException {
            Scanner scan = new Scanner(System.in);
            System.out.println("****************");
            System.out.println("1. Play ");
            System.out.println("2. Save movie ");
            System.out.println("3. Return Home Page ");
            System.out.println("****************");

            int userInput = scan.nextInt();


            switch (userInput){

                case 1:
                    System.out.println(media + " is now playing");
                    promptStop(media,currentUser);
                    break;
                case 2:
                    currentUser.saveMovie(media);
                    System.out.println("media has been saved to your list");
                    break;
                case 3:
                    displayMainMenu(currentUser);
                    break;


            }
          /*  if (userInput == 1) {
                System.out.println(media + " is now playing");
                promptStop(media,currentUser);

            }

            if (userInput == 2) {

                currentUser.saveMovie(media);
                System.out.println("media has been saved to your list");
            }

            if (userInput == 3) ;
            {
                displayMainMenu(currentUser);
            }*/
        }


        public static void displayMainMenu(User currentUser) throws FileNotFoundException {
            Scanner scan2 = new Scanner(System.in);
            System.out.println("****************");
            System.out.println("Welcome to DreamStream !");
            System.out.println("What would you like to do today?: ");
            System.out.println("1. Search for a movie. ");
            System.out.println("2. Search for a Series. ");
            System.out.println("3. Display your watched movies. ");
            System.out.println("4. Display your saved movie ");
            System.out.println("5. Exit. "); // should we run a add all movies wa
            System.out.println("****************");

            int userInput = scan2.nextInt();

            switch (userInput){

                case 1:
                    FileIO.searchMoviesList(FileIO.setupMovies());
                    System.out.println("Please remember the movie nr.");
                    promptEnterKey();
                    userSelection(currentUser);
                    break;

                case 2:
                    //search for series. Make the same function was for searching movies but just for sereis
                    break;
                case 3:
                    currentUser.displayMyWatced();
                    break;
                case 4:
                    currentUser.displayMySaved();
                    break;
                case 5:
                    System.out.println("Logging out");
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;


            }
        /*    if(userInput == 1){

               FileIO.searchMoviesList(FileIO.setupMovies());
                System.out.println("Please remember the movie nr.");
                promptEnterKey();
                userSelection(currentUser);
            }

            if(userInput == 2){

                //search for series. Make the same function was for searching movies but just for sereis
            }

            if(userInput == 3){
                currentUser.displayMyWatced();
            }

            if (userInput == 4){
                currentUser.displayMySaved();
            }

            if (userInput == 5){
                System.out.println("Logging out");
                System.out.println("Goodbye");
                System.exit(0);

            }*/

        }

        public static void userSelection(User currentUser) throws FileNotFoundException {
            Scanner scan = new Scanner(System.in);
            System.out.println("****************");
            System.out.println("What would you like to do: ");
            System.out.println("1.Search again");
            System.out.println("2.Select movie");
            System.out.println("3.return to Main menu");

            int userInput = scan.nextInt();

            if (userInput == 1) {
                FileIO.searchMoviesList(FileIO.setupMovies());
                System.out.println("Please remember the movie nr.");
                promptEnterKey();
                userSelection(currentUser);
            }




            if (userInput == 2) {

                Movie media = movies.get(getMovieNr());
                System.out.println("You have selected" + media);

                mediaFunctions(media,currentUser);

            }

            if (userInput == 3) {

                displayMainMenu(currentUser);
            }


        }

    public static void promptEnterKey(){
        System.out.println("Press enter to continue");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void promptStop(Media media,User currentUser){
        System.out.println("Press enter to stop media");
        try {
            System.in.read();
            mediaFunctions(media,currentUser);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getMovieNr(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the movie number: ");

        int movieNr = scan.nextInt();

        return movieNr;
    }
}









