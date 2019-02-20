package com.qa.Consumer.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.Consumer.persistence.domain.SentTrainer;

@Repository
public interface MongoTrainerRepo extends MongoRepository<SentTrainer, Long> {

}
