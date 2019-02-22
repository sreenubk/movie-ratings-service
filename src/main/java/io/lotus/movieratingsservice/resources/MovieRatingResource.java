package io.lotus.movieratingsservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.lotus.movieratingsservice.model.MovieRating;
import io.lotus.movieratingsservice.model.UserRating;

@RestController
@RequestMapping("/ratings")
public class MovieRatingResource {

	@RequestMapping("/{movieId}")
	public MovieRating getMovieRating(@PathVariable("movieId") String movieId) {
		return new MovieRating(movieId, "4");
	}
	
	@RequestMapping("/users/{userId}")
	public UserRating getMovieRatingByUserId(@PathVariable("userId") String userid) {
		List<MovieRating>  ratings = Arrays.asList(
				new MovieRating("123", "4"), new MovieRating("345", "3"));
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
	}
}
