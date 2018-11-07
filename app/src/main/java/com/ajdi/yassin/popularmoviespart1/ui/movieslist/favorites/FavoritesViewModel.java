package com.ajdi.yassin.popularmoviespart1.ui.movieslist.favorites;

import com.ajdi.yassin.popularmoviespart1.data.MovieRepository;
import com.ajdi.yassin.popularmoviespart1.data.model.Movie;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author Yassin Ajdi.
 */
public class FavoritesViewModel extends ViewModel {

    //    private final MovieRepository movieRepository;
    private LiveData<List<Movie>> favoriteListLiveData;

    public FavoritesViewModel(MovieRepository repository) {
        favoriteListLiveData = repository.getAllFavoriteMovies();
    }

    public LiveData<List<Movie>> getFavoriteListLiveData() {
        return favoriteListLiveData;
    }
}
