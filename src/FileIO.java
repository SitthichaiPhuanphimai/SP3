
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileIO
{
    public FileIO() {
    }

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

    public void parseFile(String fileName, String searchStr) throws FileNotFoundException
    {
        Scanner scan = new Scanner(new File(fileName));
        while(scan.hasNext())
        {
            String line = scan.nextLine().toLowerCase().toString();
            if(line.contains(searchStr.toLowerCase()))
            {
                System.out.println(line);
            }
        }
    }



    private static ArrayList<Movie> createMovieDatabase()  {


        ArrayList<Movie> movieList = new ArrayList<>();


    }


}


