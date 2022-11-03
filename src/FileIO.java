import java.io.*;
import java.util.ArrayList;

public class FileIO
{

    public ArrayList<String> readMovieData()
    {
        File file = new File("Data/movie.csv");
        ArrayList<String> data = new ArrayList<>();

        try
        {
            BufferedReader in = new BufferedReader(
                    new FileReader("data/movie.csv"));
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

