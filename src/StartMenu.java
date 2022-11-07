import java.util.Scanner;
public class StartMenu {
    static Scanner scan = new Scanner(System.in);

    public static void startMenu() {


        System.out.println("Welcome to start menu");
        System.out.println("Chose your option");
        System.out.println("- Login");
        System.out.println("- Create user");

        String userInput = scan.nextLine();


        if (userInput.equalsIgnoreCase("login")) {

           Login.login();
        }

        if (userInput.equalsIgnoreCase("create user"))
        {

            CreateUser.createUser();

        }


    }



}