package com.capgemini.movie.service;
import java.util.List;

import com.capgemini.movie.entity.Movie;
import com.capgemini.movie.exception.IdException;
import com.capgemini.movie.exception.MovieException;
import com.capgemini.movie.exception.NameException;

public interface MovieService{
	public String addMovie(String movieId,String movieName, String movieGenre, String movieActorName, String movieDirectorName)
			throws IdException, NameException, MovieException;
	public List<Movie> viewMovies();
}
