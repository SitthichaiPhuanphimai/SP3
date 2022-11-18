import org.omg.CORBA.DynAnyPackage.Invalid;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserLogin_File {

        static String user;
        static String pass;



    static Scanner scan = new Scanner(System.in);


      static String login() throws Exception {


        Scanner scan = new Scanner(new File("src/Data/users.txt"));
        Scanner keyboard = new Scanner(System.in);


        if (!scan.hasNext() ) {
            System.out.println("no users found");
            CreateUser_File.createUser();
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
                    System.out.println("user not found, try again");
                    login();
                  
                
                }


            }

        return null;
    }

}


