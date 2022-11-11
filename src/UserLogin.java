import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserLogin {

        static String user;
        static String pass;

    static Scanner scan = new Scanner(System.in);


    static void login() throws FileNotFoundException {


         checkUser();
    }



    public static void checkUser() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/Data/users.txt"));
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String inpUser = keyboard.nextLine();
        System.out.println("Enter your password: ");
        String inpPass = keyboard.nextLine();

        while (scan.hasNext())
        {

            String line = scan.next();

            if (inpUser.equals(line))
            {
                user = inpUser;
                pass = scan.next();
            }

        }


            if (inpUser.equals(user) && inpPass.equals(pass))
            {
                System.out.print("Login successful");

            } else {
                System.out.println("user name & password not found");
                System.out.println("Please try again");
//                UserLogin.login();
            }

    }
}


