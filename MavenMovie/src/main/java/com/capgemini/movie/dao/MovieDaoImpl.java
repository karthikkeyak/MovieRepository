package com.capgemini.movie.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.capgemini.movie.entity.Movie;
import com.capgemini.movie.exception.MovieException;
import com.capgemini.movie.util.MovieRepository;

public class MovieDaoImpl implements MovieDao{
	Map<String,Movie> movieMap=MovieRepository.getMovie();
   @Override
	public boolean addMovie(Movie movie) {
		movieMap.put(movie.getMovieId(), movie);
		return false;
	}

	@Override
	public List<Movie> getMovies() {
		List<Movie> list =new ArrayList<>();
		movieMap.values().stream().forEach(m->list.add(m));
		return list;
	}

	@Override
	public Movie getMovie(String movieId) throws MovieException {
		if(!movieMap.containsKey(movieId))
			throw new MovieException("Movie does not Exist!.");
		
		return movieMap.get(movieId);
	}

	
}
