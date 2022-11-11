import java.util.Scanner;

public class CreateUser {

    static Scanner scan = new Scanner(System.in);


    static void createUser()
    {
        String newUserName = getNewUserName();
        String newPassword = getNewPassword();

        FileIO.writeUser(newUserName, newPassword);


    }


    private static String getNewUserName(){

        System.out.println("Enter your userName for your user: ");
        String userName = scan.nextLine();

        return userName;
    }


    private static String getNewPassword(){

        System.out.println("Enter your password for your user: ");
        String password = scan.nextLine();

        return password;
    }
}
