import java.util.Scanner;

public class Login {


    static Scanner scan = new Scanner(System.in);

    static void login(){

        System.out.println("LOGIN");


        System.out.println("Enter your username: ");

        String userName = scan.nextLine();


        System.out.println("Enter your password: ");

        String password = scan.nextLine();

    }
}
