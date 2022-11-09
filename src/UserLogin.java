import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserLogin {


    static Scanner scan = new Scanner(System.in);

    static void login() throws FileNotFoundException {

       String userName = getUserName();
       String password = getPassword();

        FileIO.checkUser(userName,password);


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
