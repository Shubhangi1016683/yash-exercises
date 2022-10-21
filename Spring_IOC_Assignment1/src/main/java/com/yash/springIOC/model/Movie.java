package com.yash.springIOC.model;

public class Movie {
	
	private String movieName;
	private String movieTime;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String movieName, String movieTime) {
		super();
		this.movieName = movieName;
		this.movieTime = movieTime;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieTime() {
		return movieTime;
	}
	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}
	public void show()
	{
		System.out.format("MovieName:- "+movieName);
		System.out.println();
		System.out.format("MovieTime :-  "+movieTime);
		System.out.println();
	
	}
	

}
