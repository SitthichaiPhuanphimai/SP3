import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO
{

    public ArrayList<String> readMovieData()
    {
        File file = new File("Data/movie.txt");
        ArrayList<String> data = new ArrayList<>();

        try
        {
            BufferedReader in = new BufferedReader(
                    new FileReader("data/movie.txt"));
            String str;

            while ((str = in.readLine()) != null)
            {
                String[] ar = str.split(";");
            }
            in.close();
        } catch (IOException e)
        {
            System.out.println("File Read Error");
        }
        return data;
    }
}

