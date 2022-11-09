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

        public static void mediaFunctions() {
            Scanner scan = new Scanner(System.in);
            System.out.println("****************");
            System.out.println("1. Play ");
            System.out.println("2. Stop ");
            System.out.println("3. Return Home Page ");
            System.out.println("****************");

            if (scan.nextInt() == 1)
            {
                // play(Media media);
            }

            if(scan.nextInt() == 2)
            {
                //stop(Media media);
            }

            if (scan.nextInt() == 3) ;
            {
                //displayMainMenu();
            }

        }


        public static void displayMainMenu() throws FileNotFoundException {
            Scanner scan2 = new Scanner(System.in);
            System.out.println("****************");
            System.out.println("Welcome to DreamStream !");
            System.out.println("What would you like to do today?: ");
            System.out.println("1. Search for a movie. ");
            System.out.println("2. Search for a Series. ");
            System.out.println("3. Display your watched movies. ");
            System.out.println("4. Display your " + "watch later " + "movies ");
            System.out.println("5. Exit. "); // should we run a add all movies wa
            System.out.println("****************");

            int userChoice = scan2.nextInt();


            if(userChoice == 1){

               FileIO.searchMoviesList(FileIO.setupMovies());
                System.out.println("Please remember the movie nr.");
                promptEnterKey();
                userSelection();
            }

        }

        public static void userSelection() throws FileNotFoundException {
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
                userSelection();
            }




            if (userInput == 2) {

                System.out.println("you have selected:"+FileIO.setupMovies().get(getMovieNr() ).getName());

                mediaFunctions();

            }

            if (userInput == 3) {

                displayMainMenu();
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

    public static int getMovieNr(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the movie number: ");

        int movieNr = scan.nextInt();

        return movieNr;
    }
}









