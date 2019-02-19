package com.qa.InspectorFacade.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoTraineeRepo extends MongoRepository<SentTrainee, Long> {

}
