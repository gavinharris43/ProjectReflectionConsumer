package com.qa.Consumer.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.Consumer.persistence.domain.SentTrainee;

@Repository
public interface MongoTraineeRepo extends MongoRepository<SentTrainee, Long> {

}
