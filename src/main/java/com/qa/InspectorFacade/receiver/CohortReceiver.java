package com.qa.InspectorFacade.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.InspectorFacade.persistence.repository.MongoTrainerRepo;

@Component
public class CohortReceiver {
	
	@Autowired
    private MongoTrainerRepo repo;
	
	@JmsListener(destination = "InspectorFacadeQueue", containerFactory = "InspectorFacade")
    public void receiveMessage(SentCohort sentCohort) {
        repo.save(sentCohort);
    }

}
