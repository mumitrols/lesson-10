package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    Movie movie0 = new Movie("1", "url_1", "Фильм_1", "комедия");
    Movie movie1 = new Movie("2", "url_2", "Фильм_2", "ужасы");
    Movie movie2 = new Movie("3", "url_3", "Фильм_3", "мелодрама");
    Movie movie3 = new Movie("4", "url_4", "Фильм_4", "ужасы");

    @Test
    void specifiedNumberElementsToOutput() {
        MovieManager manager = new MovieManager(3);
        manager.save(movie0);
        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);

        Movie[] expected = {movie3, movie2, movie1};
        Movie[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void defaultNumberElementsToOutput() {
        MovieManager manager = new MovieManager();
        manager.save(movie0);
        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);

        Movie[] expected = {movie3, movie2, movie1, movie0};
        Movie[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }
}