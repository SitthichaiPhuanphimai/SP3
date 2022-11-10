import java.util.*;
import java.io.*;

public class FileIO {
    Scanner scan = new Scanner(System.in);

    public static ArrayList<String> readData(File file)
    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            ArrayList<String> data = new ArrayList<>();

            String currentLine = reader.readLine();
            while (currentLine != null) {
                data.add(currentLine);
                currentLine =reader.readLine();
            }
            return data;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void createFile() {
        try {
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



    public static void writeUser(String userName, String password) {
        try {
            FileWriter writer = new FileWriter("src/Data/users.txt", true);
            writer.write(userName + " " + password + '\n');
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public static ArrayList<Movie> setupMovies()
    {
        ArrayList<Movie> movieList = new ArrayList<>();

        File file = new File("src/Data/movie.txt");

        try
        {
            Scanner readMovies = new Scanner(file);

            while (readMovies.hasNextLine())
            {
                String line = readMovies.nextLine();
                String[] values = line.split(";");

                String name = values[0].trim();

                int releaseYear = Integer.parseInt(values[1].trim());
                ArrayList<String> genre = new ArrayList<>();

                String[] genreArr = values[2].trim().split(",");
                genre.addAll(Arrays.asList(genreArr));

                float rating = Float.parseFloat(values[3].trim().replace(",", "."));

                movieList.add(new Movie(name, releaseYear, genre, rating));
            }
        } catch (IOException e)
        {
            System.out.println("File not found");
        }
        return movieList;
    }

    public static ArrayList<User> setupUsers()
    {
        ArrayList<String>userdata = readData(new File("src/Data/users.txt"));
        ArrayList<User>userList = new ArrayList<>();

        for (String s:userdata) {
            String[] userLogin = s.split(" ");

            String userName = userLogin[0];
            String userPassword = userLogin[1];


            userList.add(new User(userName,userPassword, new ArrayList<>(), new ArrayList<>()));
        }

        return userList;
    }




    public static ArrayList<Movie> searchMoviesList(ArrayList<Movie> movieList){

        System.out.println("Enter your a movie title or press enter to display all movies: ");
        Scanner scan = new Scanner(System.in);
        String searchStr = scan.nextLine();
        ArrayList<Movie> result = new ArrayList<>();
        for (Movie m : movieList)
        {
            if(m.getName().toLowerCase().contains(searchStr.toLowerCase()))
            {
                result.add(m);
                System.out.println("Movie nr. "+movieList.indexOf(m)+": "+(m));

                }


            }

        return result;
    }




}

