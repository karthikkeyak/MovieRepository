package com.capgemini.test;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import com.capgemini.movie.dao.MovieDao;
import com.capgemini.movie.dao.MovieDaoImpl;
import com.capgemini.movie.exception.IdException;
import com.capgemini.movie.exception.MovieException;
import com.capgemini.movie.exception.NameException;
import com.capgemini.movie.service.MovieService;
import com.capgemini.movie.service.MovieServiceImpl;

public class TestAddMovie {
	
	@Test
	@DisplayName("Test case 1")
	public void movieTest1() throws IdException,NameException{
		MovieService ser = new MovieServiceImpl();
		assertThrows(IdException.class,()->ser.addMovie("1","karthikeya","action","nitin","nikhil"));
	}
	@Test
	public void movieTest2() throws IdException,NameException{
		MovieService ser = new MovieServiceImpl();
		assertThrows(IdException.class,()->ser.addMovie("ksjnf","masthan","drama","michael","anil"));
	}
	@Test
	public void movieTest3() throws IdException,NameException{
		MovieService ser = new MovieServiceImpl();
		assertThrows(IdException.class,()->ser.addMovie("__88","anil","crime","john","kumarsai"));
	}
	@Test
	public void movieTest4() throws IdException,NameException{
		MovieService ser = new MovieServiceImpl();
		assertThrows(IdException.class,()->ser.addMovie("   ","ramesh","thriller","george","ravikumar"));
	}
	
	@Test
	public void movieTest5() throws IdException,NameException{
		MovieService ser = new MovieServiceImpl();
		MovieDao dao = new MovieDaoImpl();
		assertThrows(MovieException.class,()->dao.getMovie(""));
	}
	
}
