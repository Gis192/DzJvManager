package ru.netology.DzJvManager.MovieMngrTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.DzJvManager.MovieManager.MovieManager;

public class MovieMngrTest {

    @Test
    public void testAddMovie() {
        MovieManager manager = new MovieManager();

        manager.movieAdd("Fast Furious 1");
        manager.movieAdd("Fast Furious 2");
        manager.movieAdd("Fast Furious 3");

        String[] expected = {"Fast Furious 1", "Fast Furious 2", "Fast Furious 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void tetsFindLastAboveLimit() {
        MovieManager manager = new MovieManager();

        manager.movieAdd("Fast and Furious 1");
        manager.movieAdd("Fast and Furious 2");
        manager.movieAdd("Fast and Furious 3");
        manager.movieAdd("Fast and Furious 4");
        manager.movieAdd("Fast and Furious 5");
        manager.movieAdd("Fast and Furious 6");
        manager.movieAdd("Fast and Furious 7");
        manager.movieAdd("Fast and Furious 8");
        manager.movieAdd("Fast and Furious 9");
        manager.movieAdd("Fast and Furious 10");
        manager.movieAdd("Fast and Furious 11");
        manager.movieAdd("Fast and Furious 12");

        String[] expected = {"Fast and Furious 12", "Fast and Furious 11", "Fast and Furious 10",
                "Fast and Furious 9", "Fast and Furious 8", "Fast and Furious 7",
                "Fast and Furious 6", "Fast and Furious 5", "Fast and Furious 4", "Fast and Furious 3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void tetsFindLastBelowLimit() {
        MovieManager manager = new MovieManager();

        manager.movieAdd("Fast and Furious 4");
        manager.movieAdd("Fast and Furious 5");
        manager.movieAdd("Fast and Furious 6");
        manager.movieAdd("Fast and Furious 7");
        manager.movieAdd("Fast and Furious 8");
        manager.movieAdd("Fast and Furious 9");
        manager.movieAdd("Fast and Furious 10");
        manager.movieAdd("Fast and Furious 11");
        manager.movieAdd("Fast and Furious 12");

        String[] expected = {"Fast and Furious 12", "Fast and Furious 11", "Fast and Furious 10",
                "Fast and Furious 9", "Fast and Furious 8", "Fast and Furious 7",
                "Fast and Furious 6", "Fast and Furious 5", "Fast and Furious 4"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
