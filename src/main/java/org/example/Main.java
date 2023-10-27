public class Main {
    public static void main(String[] args) {
        MovieManager movieManager = new MovieManager();

        movieManager.addMovie("The Shawshank Redemption");
        movieManager.addMovie("The Godfather");
        movieManager.addMovie("Pulp Fiction");
        movieManager.addMovie("The Dark Knight");
        movieManager.addMovie("Fight Club");

        String[] allMovies = movieManager.findAll();
        System.out.println("All movies:");
        for (String movie : allMovies) {
            System.out.println(movie);
        }

        String[] lastMovies = movieManager.findLast();
        System.out.println("\nLast movies:");
        for (String movie : lastMovies) {
            System.out.println(movie);
        }
    }
}