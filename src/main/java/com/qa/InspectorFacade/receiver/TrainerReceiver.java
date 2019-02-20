package com.qa.InspectorFacade.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.InspectorFacade.persistence.domain.SentTrainer;
import com.qa.InspectorFacade.persistence.repository.MongoTrainerRepo;

@Component
public class TrainerReceiver {
	
	@Autowired
    private MongoTrainerRepo repo;
	
	@JmsListener(destination = "InspectorFacadeQueue", containerFactory = "InspectorFactory")
    public void receiveMessage(SentTrainer sentTrainer) {
        repo.save(sentTrainer);
    }

}
