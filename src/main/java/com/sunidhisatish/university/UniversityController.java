package com.sunidhisatish.university;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/movies")
public class UniversityController {
    @Autowired
    private UniversityService universityService;
    @GetMapping
    public ResponseEntity<List<University>> allMovies() {
        return new ResponseEntity<List<University>>(universityService.response(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<University>> oneMovie(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<University>>(universityService.findResponseItemByImdbId(imdbId), HttpStatus.OK);
    }
}
