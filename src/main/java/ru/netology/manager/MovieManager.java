package ru.netology.manager;
import ru.netology.manager.Movie;

public class MovieManager {
    private int outputMoviesCount = 10;
    private Movie[] films = new Movie[0];

    public MovieManager() {
    }

    public MovieManager(int outputCount) {
        this.outputMoviesCount = outputCount;
    }

    public void save(Movie movie) {
        Movie[] temp = new Movie[films.length + 1];
        System.arraycopy(films, 0, temp, 0, films.length);
        temp[temp.length - 1] = movie;
        this.films = temp;
    }

    public Movie[] getAll() {
        int resultLength = 0;

        if ((films.length < outputMoviesCount)) {
            resultLength = films.length;
        } else {
            resultLength = outputMoviesCount;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
