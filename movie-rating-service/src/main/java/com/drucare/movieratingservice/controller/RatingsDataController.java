package com.drucare.movieratingservice.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.movieratingservice.model.Rating;

@RestController
public class RatingsDataController {

	@RequestMapping("/ratingsdata/{movieId}")
	public Rating getRating(@PathVariable String movieId){
		return new Rating(movieId,4);
	}
}