import java.util.Scanner;

public class CreateUser_File {

    static Scanner scan = new Scanner(System.in);


    static void createUser() throws Exception {
        System.out.println("**USER CREATION**");
        String newUserName = getNewUserName();
        String newPassword = getNewPassword();

        FileIO.writeUser(newUserName, newPassword);

        System.out.println("user created - Please login");
        UserLogin_File.login();
//        return newUserName;


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
