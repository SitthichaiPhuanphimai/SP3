import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextUI {



        public static void mediaFunctions(User currentUser, Media media) {
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


        public static void displayMainMenu(User currentUser) throws FileNotFoundException {
            Scanner scan2 = new Scanner(System.in);
            System.out.println("****************");
            System.out.println("Welcome to DreamStream "+currentUser.getUserName()+"!");
            System.out.println("What would you like to do today?: ");
            System.out.println("1. Search for a movie. ");
            System.out.println("2. Display your watched movies. ");
            System.out.println("3. Display your " + "watch later " + "movies ");
            System.out.println("4. Exit. "); // should we run a add all movies wa
            System.out.println("****************");

            int userChoice = scan2.nextInt();

            if(userChoice == 1)
            {
                currentUser.search();
            }

            if (userChoice == 2)
            {
               currentUser.displayMyWatced();
            }

            if(userChoice == 3)
            {
                currentUser.displayMySaved();
            }

            if (userChoice == 4)
            {
                System.out.println("Goodbye");
            }

        }
    }

