package com.drucare.movieratingservice.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.movieratingservice.model.Rating;
import com.drucare.movieratingservice.model.UserRating;

@RestController
public class RatingsDataController {

	@RequestMapping("/ratingsdata/{movieId}")
	public Rating getRating(@PathVariable String movieId){
		return new Rating(movieId,4);
	}
	

	@RequestMapping("/ratingsdata/user/{userId}")
	public UserRating getUserRating(@PathVariable String userId){
		List<Rating> ratingsList = Arrays.asList(new Rating("445",1),
				new Rating("123",3));
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratingsList);
		return userRating;
	}
}