import java.util.Scanner;
public class StartMenu {
    static Scanner scan = new Scanner(System.in);
    static String newUserName;
    static String newPassword;


    public static void startMenu() {


        System.out.println("Welcome to start menu");
        System.out.println("Chose your option");
        System.out.println("- Login");
        System.out.println("- Create user");

        String userInput = scan.nextLine();


        if (userInput.equalsIgnoreCase("login")) {

           login();
        }

        if (userInput.equalsIgnoreCase("create user"))
        {

              createUser();

        }


    }


    private static void login(){

        System.out.println("LOGIN");


        System.out.println("Enter your username: ");

        String userName = scan.nextLine();


        System.out.println("Enter your password: ");

        String password = scan.nextLine();

    }
    private static void createUser(){
        newUserName = getUserName();
        newPassword = getPassword();
    }

    private static String getUserName(){

        System.out.println("Enter your userName for your user: ");
        String userName = scan.nextLine();

        return userName;
    }


    private static String getPassword(){

        System.out.println("Enter your password for your user: ");
        String password = scan.nextLine();

            return password;
        }



}