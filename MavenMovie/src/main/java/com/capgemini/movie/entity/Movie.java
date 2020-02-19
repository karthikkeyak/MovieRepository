package com.capgemini.movie.entity;

public class Movie {
	private String movieId;
	private String movieName;
	private String movieGenre;
	private String movieActorName;
	private String movieDirectorName;
	public Movie() {}
	public Movie(String movieId,String movieName, String movieGenre, String movieActorName, String movieDirectorName){
	this.movieId=movieId;
	this.movieName=movieName;
	this.movieActorName=movieActorName;
	this.movieDirectorName=movieDirectorName;
	this.movieGenre=movieGenre;
	}
	public String getMovieName() {
		return movieName;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public String getMovieActorName() {
		return movieActorName;
	}
	public void setMovieActorName(String movieActorName) {
		this.movieActorName = movieActorName;
	}
	public String getMovieDirectorName() {
		return movieDirectorName;
	}
	public void setMovieDirectorName(String movieDirectorName) {
		this.movieDirectorName = movieDirectorName;
	}
	@Override
	public String toString() {
		return movieId+" "+movieName+" "+movieGenre+" "+movieActorName+ " " +movieDirectorName;
	}
	
}
