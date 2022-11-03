public class Main {

    public static void main(String[] args) {

        Categories movieList = new Categories();


        Movie titanic = new Movie("Titanic", 0, false);
        movieList.addMovie(titanic);

        System.out.println(movieList.toString());

    }
}
