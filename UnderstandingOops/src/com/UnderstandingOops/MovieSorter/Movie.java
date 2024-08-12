package com.UnderstandingOops.MovieSorter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class Movie {
	private String title;
	private String director;
	private double rating;

	public Movie(String title, String director, double rating) {
		this.title = title;
		this.director = director;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public double getRating() {
		return rating;
	}

	
	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", rating=" + rating + "]";
	}

	public static List<Movie> sortMoviesByRating(List<Movie> movies) {
		return movies.stream()
		 	   .sorted((movie1,movie2)->Double.compare(movie2.getRating(), movie1.getRating()))
		       .collect(Collectors.toList());
				
	}
	public static void main(String[] args) {
		List<Movie> movies= Arrays.asList(
				new Movie("Inception1","Christopher Nolan",8.8),
				new Movie("Inception2","Christopher Nolan",4.8),
				new Movie("Inception3","Christopher Nolan",5.8)
		);
		System.out.println("Movies before sorting : ");
		for(Movie movie: movies) {
			System.out.println(movie);
		}
		movies=sortMoviesByRating(movies);
		
		System.out.println("Movies after sorting : ");
		for(Movie movie: movies) {
			System.out.println(movie);
		}
		
		

	}

}
