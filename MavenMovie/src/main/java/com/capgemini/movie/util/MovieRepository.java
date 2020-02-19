package com.capgemini.movie.util;
import java.util.HashMap;
import java.util.Map;
/**
 ***AuthorName--Karthikeya
 ***Description--Creating categories and putting into map
 ***return type--map
**/
    import com.capgemini.movie.entity.Movie;
    public class MovieRepository {
    public static Map<String,Movie> movieMap=new HashMap();

    static
	{
		movieMap.put("1111",new Movie("1111","Avengers","Sci-fi","RDJ","russo"));
		movieMap.put("2222",new Movie("2222","Irishman","Drama","deNiro","martin scorcese"));
		movieMap.put("3333",new Movie("3333","spiderman","action","supse","robo"));
		
	}
    public static Map<String,Movie> getMovie()
    {
    	return movieMap;
    }
}
