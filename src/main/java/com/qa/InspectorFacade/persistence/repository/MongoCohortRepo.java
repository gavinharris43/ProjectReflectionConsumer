package com.qa.InspectorFacade.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.InspectorFacade.persistence.domain.SentCohort;

@Repository
public interface MongoCohortRepo extends MongoRepository<SentCohort, Long>{

}
