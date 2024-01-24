package com.sunidhisatish.university;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {
	@Autowired
	private UniversityRepository universityRepository;
	public List<University> response(){
		return universityRepository.findAll();
	}

	public Optional<University> findResponseItemByImdbId(String imdbId) {
		return universityRepository.findResponseItemByImdbId(imdbId);
	}
}