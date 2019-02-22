package io.lotus.movieratingsservice.model;

import java.util.List;

public class UserRating {

	private List<MovieRating> userRating;
	
	public UserRating() {
		
	}

	public List<MovieRating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<MovieRating> userRating) {
		this.userRating = userRating;
	}
}
