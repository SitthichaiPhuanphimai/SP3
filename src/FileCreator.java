import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileCreator {

    Scanner scan = new Scanner(System.in);
    Scanner passw = new Scanner (System.in);
    public void createFile()
    {
        try
        {
            File usrFile = new File("users.txt");
            if (usrFile.createNewFile()) {
                System.out.println("File created: " + usrFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeUsers(String userName, String password) // should scanner happen in user class
    {
        try
        {
            FileWriter usrWriter = new FileWriter("users.txt");
            usrWriter.write(userName); // again should there be a variable in user class when you create user to insert here.
            usrWriter.write(password); // again should there be a variable in user class when you create user to insert here.
            usrWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }




}
