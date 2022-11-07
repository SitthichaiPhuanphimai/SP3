import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class FileSearcher {

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


    public static void main(String[] args) throws FileNotFoundException
    {
        FileSearcher fileSearch = new FileSearcher();
        fileSearch.parseFile("src/Data/movie.txt", "action");
    }



}
