package com.druPractice.moviecatalogueservice.controller;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.druPractice.moviecatalogueservice.model.Catalogue;
import com.druPractice.moviecatalogueservice.model.Movie;
import com.druPractice.moviecatalogueservice.model.Rating;
import com.druPractice.moviecatalogueservice.model.UserRating;

@RestController
public class MovieCatalogueController {

	@Autowired  //consumer like 
	RestTemplate restTemplate;

	@RequestMapping("/catalog/{userId}")
	public List<Catalogue> getCatalogue(@PathVariable String userId){
		//		return Collections.singletonList(new Catalogue("spidy","saving earth",4));
		//hardcoded ratingsdata 
//		List<Rating> ratingsList = Arrays.asList(new Rating("123",4),
//				new Rating("5678",3));
		UserRating userRating = restTemplate.getForObject("http://localhost:8013/ratingsdata/user/33",UserRating.class);
		
		return userRating.getUserRating().stream()
				.map(rating -> {
					Movie movie = restTemplate.getForObject("http://localhost:8012/movies/4",Movie.class);
					return new Catalogue(movie.getName(),"test",rating.getRating());
					//not hardcode, i have to get from api
				})
				.collect(Collectors.toList());

	}
}
