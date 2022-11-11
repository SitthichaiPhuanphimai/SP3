import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserLogin {

        static String user;
        static String pass;

    static Scanner scan = new Scanner(System.in);


     static String login() throws FileNotFoundException {


        Scanner scan = new Scanner(new File("src/Data/users.txt"));
        Scanner keyboard = new Scanner(System.in);
//        ArrayList<User> userList = FileIO.setupUsers();

        if (!scan.hasNext() ) {
            System.out.println("no users found");
            CreateUser.createUser();
        } else {
            System.out.println("Enter your username: ");
            String inpUser = keyboard.nextLine();
            System.out.println("Enter your password: ");
            String inpPass = keyboard.nextLine();




                while (scan.hasNext()) {

                    String line = scan.next();

                    if (inpUser.equals(line)) {
                        user = inpUser;
                        pass = scan.next();

                    }

                }


                if (inpUser.equals(user) && inpPass.equals(pass)) {
                    System.out.print("Login successful");
                    return inpUser;

                } else {
                    System.out.println("user name & password not found");
                    System.out.println("Please try again");
//

                }


            }


        return null;
    }

}


