import java.util.Scanner;

public class User implements MainMenu {

    Scanner scan = new Scanner(System.in);
    String userName;
    String password;

    public User(String userName, String password) {

        this.userName = userName;
        this.password = password;
    }

    @Override
    public void search() {

        System.out.println("Please enter Media name: ");

        String choice = scan.nextLine();






    }

    @Override
    public void searchAllInCat() {

    }

    @Override
    public void displayMyWatced() {

    }

    @Override
    public void displayMySaved() {

    }
}


