package com.qa.InspectorFacade.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.InspectorFacade.persistence.domain.SentCohort;
import com.qa.InspectorFacade.persistence.repository.MongoCohortRepo;

@Component
public class CohortReceiver {
	
	@Autowired
    private MongoCohortRepo repo;
	
	@JmsListener(destination = "CohortQueue", containerFactory = "myFactory")
    public void receiveMessage(SentCohort sentCohort) {
        repo.save(sentCohort);
    }

}
