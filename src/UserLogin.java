import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserLogin {


    static Scanner scan = new Scanner(System.in);


    static void login() throws FileNotFoundException {


        String userName = getUserName();
        String password = getPassword();

         checkUser(userName,password);
    }

    private static String getUserName() {

        System.out.println("Enter your user Name for your user: ");
        String userName = scan.nextLine();

        return userName;
    }

    private static String getPassword() {

        System.out.println("Enter your password for your user: ");
        String password = scan.nextLine();

        return password;
    }

    public static void checkUser(String userName, String password) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("src/Data/users.txt"));

        String user = scan.next();

        String pass = scan.next();


        if (userName.equals(user) && password.equals(pass)) {
            System.out.print("Login successful");

        } else {
            System.out.println("user name & password not found");
            System.out.println("Please try again");
            UserLogin.login();
        }

    }

}


