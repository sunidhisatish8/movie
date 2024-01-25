package com.sunidhisatish.university;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Data
@Document(collection = "university")
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	@Id
	private ObjectId id;
	@DocumentReference
	private List<Review> reviewIds;
	private String releaseDate;
	private String imdbId;
	private List<String> genres;
	private List<String> backdrops;
	private String title;
	private String poster;
	private String trailerLink;
}