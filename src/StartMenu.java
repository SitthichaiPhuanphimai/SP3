import java.util.Scanner;
public class StartMenu {


    public static void startMenu() {


        Scanner scan = new Scanner(System.in);



        System.out.println("Welcome to start menu");

        //if  a user is alredy stored in .txt
        System.out.println("Chose your option");
        System.out.println("1. Login");
        System.out.println("2. Create user");

        int userInput = scan.nextInt();

        if (userInput == 1) {

            System.out.println("LOGIN");


           System.out.println("Enter your username: ");

            String userName = scan.nextLine();


            System.out.println("Enter your password: ");

            String password = scan.nextLine();



            if (userInput == 2){
                System.out.println("Enter your userName for your user: ");
                userName = scan.nextLine();

                System.out.println("Enter your password for your user: ");
                password = scan.nextLine();

                createUser(userName,password);
            }

        } else {

            System.out.println("Please Create a user");

            System.out.println("Enter your userName for your user: ");
            String userName = scan.nextLine();

            System.out.println("Enter your password for your user: ");
            String password = scan.nextLine();

            createUser(userName, password);

        }



    }


    private static void createUser(String userName, String password){

        User newUser = new User(userName, password);
    }


}