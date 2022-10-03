package com.drucare.movieinfoservice.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.movieinfoservice.model.Movie;

@RestController
public class MovieInfoController {


	@RequestMapping("/movies/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId){
		return new Movie(movieId,"test name");
	}
}
