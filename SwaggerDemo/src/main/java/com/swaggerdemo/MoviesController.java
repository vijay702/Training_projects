package com.swaggerdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {
	
	
	private static List<Movie> movies = new ArrayList<Movie>();
	
	
	@GetMapping("/movies")
	public List<Movie> getMovies(){
		return movies;
		
		
	}
	
	@PostMapping("/movies")
	public Movie addMovie(@RequestBody Movie movie) {
		
		movies.add(movie);
		return movie;
				
				
		
	}
	
	

}
