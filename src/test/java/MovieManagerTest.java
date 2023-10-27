import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void testFindAllEmpty() {
        MovieManager manager = new MovieManager();
        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAllOneMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film I");

        String[] actual = manager.findAll();
        String[] expected = {"Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithLessMoviesThanLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film I");
        manager.addMovie("Film II");

        String[] actual = manager.findLast();
        String[] expected = {"Film II", "Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithMoreMoviesThanLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film I");
        manager.addMovie("Film II");
        manager.addMovie("Film III");
        manager.addMovie("Film IV");
        manager.addMovie("Film V");
        manager.addMovie("Film VI");

        String[] actual = manager.findLast();
        String[] expected = {"Film VI", "Film V", "Film IV", "Film III", "Film II"};
        Assertions.assertArrayEquals(expected, actual);
    }
}