package com.qa.Consumer.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.Consumer.persistence.domain.SentCohort;
import com.qa.Consumer.persistence.repository.MongoCohortRepo;

@Component
public class CohortReceiver {
	
	@Autowired
    private MongoCohortRepo repo;
	
	@JmsListener(destination = "InspectorFacadeQueue", containerFactory = "myFactory")
    public void receiveMessage(SentCohort sentCohort) {
        repo.save(sentCohort);
    }

}
