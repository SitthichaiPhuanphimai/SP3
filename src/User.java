import java.util.Scanner;

public class User {

    String userName;
    String password;

    public User(String userName, String password) {

        this.userName = userName;
        this.password = password;
    }

    public static void createUser(){


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your username: ");
        userName = scan.nextLine();

        System.out.print("Enter your password: ");
        password = scan.nextLine();

        FileIO.writeDate();

    }
}


