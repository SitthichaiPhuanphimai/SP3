import java.util.Scanner;
public class StartMenu {

    private void startMenu(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to start menu");
        System.out.println("1. Login");
        System.out.println("2. Create user");

        int choice = scan.nextInt();

        if(choice == 2){
            User.createUser();

        }




    }

}
