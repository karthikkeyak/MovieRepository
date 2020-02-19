package com.capgemini.movie.dao;

import java.util.List;

import com.capgemini.movie.entity.Movie;
import com.capgemini.movie.exception.MovieException;

public interface MovieDao {
	public boolean addMovie(Movie movie);
	public List<Movie> getMovies();
	public Movie getMovie(String movieId) throws MovieException;
}
