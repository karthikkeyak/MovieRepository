package com.capgemini.movie.service;
import java.util.List;

import com.capgemini.movie.dao.MovieDao;
import com.capgemini.movie.dao.MovieDaoImpl;
import com.capgemini.movie.entity.Movie;
import com.capgemini.movie.exception.IdException;
import com.capgemini.movie.exception.MovieException;
import com.capgemini.movie.exception.NameException;
public class MovieServiceImpl implements MovieService{
	MovieDao movieDao = new MovieDaoImpl();

	
	
	public boolean validateId(String id) throws IdException {
	if (!id.matches("[0-9]{4}")) {
	throw new IdException("Id is inavlid");
	}
	return true;
	}

	public boolean validateMovieName(String tname) throws NameException {
	if (!tname.matches("[a-zA-Z]")) {
	throw new NameException("Name is Invalid");
	}
	return true;
	}

	public String addMovie(String movieId,String movieName, String movieGenre, String movieActorName, String movieDirectorName)
	throws IdException, NameException, MovieException
	{
	if (validateId(movieId) && validateMovieName(movieName))
		{
	if(movieDao.getMovie(movieId)!= null);
	{
	Movie movie = new Movie(movieId,movieName,movieGenre,movieActorName,movieDirectorName);
	movieDao.addMovie(movie);
	
	{
	return "movie ID already exists";
	}
	}
		}
	return " Theatre Inserted Successfully";
	}
	public List<Movie> viewMovies() 
	{

	return movieDao.getMovies();
	}

}