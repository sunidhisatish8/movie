package com.sunidhisatish.university;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepository;
	public List<Movie> response(){
		return movieRepository.findAll();
	}

	public Optional<Movie> findResponseItemByImdbId(String imdbId) {
		return movieRepository.findResponseItemByImdbId(imdbId);
	}
}