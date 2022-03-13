package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest1 {
    Movie movie0 = new Movie("1", "url_1", "Фильм_1", "комедия");
    Movie movie1 = new Movie("2", "url_2", "Фильм_2", "ужасы");
    Movie movie2 = new Movie("3", "url_3", "Фильм_3", "мелодрама");
    Movie movie3 = new Movie("4", "url_4", "Фильм_4", "ужасы");
    Movie movie4 = new Movie("5", "url_5", "Фильм_5", "ужасы");
    Movie movie5 = new Movie("6", "url_6", "Фильм_6", "мультфильм");
    Movie movie6 = new Movie("7", "url_7", "Фильм_7", "ужасы");
    Movie movie7 = new Movie("8", "url_8", "Фильм_8", "ужасы");
    Movie movie8 = new Movie("9", "url_9", "Фильм_9", "фентази");
    Movie movie9 = new Movie("10", "url_10", "Фильм_10", "фентази");
    Movie movie10 = new Movie("11", "url_11", "Фильм_11", "фентази");

    @Test
    void numberElementsMore10() {
        MovieManager manager = new MovieManager();
        manager.save(movie0);
        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);
        manager.save(movie6);
        manager.save(movie7);
        manager.save(movie8);
        manager.save(movie9);
        manager.save(movie10);

        Movie[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Movie[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void specifiedNumberElementsToOutput1() {
        MovieManager manager = new MovieManager(5);
        manager.save(movie0);
        manager.save(movie1);
        manager.save(movie2);
        manager.save(movie3);
        manager.save(movie4);
        manager.save(movie5);
        manager.save(movie6);
        manager.save(movie7);
        manager.save(movie8);
        manager.save(movie9);
        manager.save(movie10);

        Movie[] expected = {movie10, movie9, movie8, movie7, movie6};
        Movie[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }
}

