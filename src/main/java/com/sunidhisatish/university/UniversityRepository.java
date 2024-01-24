package com.sunidhisatish.university;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UniversityRepository extends MongoRepository<University, ObjectId> {
    Optional<University> findResponseItemByImdbId(String imdbId);
}
