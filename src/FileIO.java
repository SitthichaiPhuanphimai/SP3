import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileIO
{
        public ArrayList<String> readSavedMovieList() throws FileNotFoundException
        {

            File file = new File("src/data/movie.txt");
            ArrayList<String> movies = new ArrayList<>();
            Scanner input = new Scanner(file);
            while (input.hasNextLine())
            {
                String s = input.nextLine();
                String[] data = s.split(",");
                String name = data[0];
                int releaseYear = Integer.parseInt(data[1]);
                String genre = data[2];
                int rating = Integer.parseInt(data[3]);
                Movie m = new Movie(name, releaseYear, genre, rating);
                movies.add(m);
            }

            for (String m : movies)
            {
                System.out.println("Movie name: " + m.getName() + " release year: " + m.getReleaseYear() + "Genre " + m.getGenre() + "Rating: "+ m.getRating());
            }

            return movies;
        }


    public static void writeSavedMovieData(ArrayList<Movie> savedMovies)
    {
        try {
                FileWriter writer = new FileWriter("src/Data/movie.txt");
                writer.write( "name, release year, genre, rating\n");

                    for (Movie m : savedMovies)
                    {
                        writer.write(m.getName() + "," + m.getReleaseYear() + "," + m.getGenre()+ "," + m.getRating() +"\n");
                    }
                writer.close();
        } catch (IOException e)
            {
                System.out.println(e);
            }
    }

}

