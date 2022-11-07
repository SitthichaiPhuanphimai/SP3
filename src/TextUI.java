import java.util.Scanner;

public class TextUI {



        public void mediaFunctions() {
            Scanner scan = new Scanner(System.in);
            System.out.println("****************");
            System.out.println("1. Play ");
            System.out.println("2. Stop ");
            System.out.println("3. Return Home Page ");
            System.out.println("****************");

            if (scan.nextInt() == 3) ;
            {
                //displayMainMenu();
            }

        }


        public void displayMainMenu()
        {
            System.out.println("****************");
            System.out.println("Welcome to DreamStream!");
            System.out.println("What would you like to do today?: ");
            System.out.println("1. Search for a movie. ");
            System.out.println("2. Display your watched movies. ");
            System.out.println("3. Display your " + "watch later " + "movies ");
            System.out.println("4. Exit. "); // should we run a add all movies wa
            System.out.println("****************");
        }
    }

