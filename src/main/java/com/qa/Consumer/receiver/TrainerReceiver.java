package com.qa.Consumer.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.Consumer.persistence.domain.SentTrainer;
import com.qa.Consumer.persistence.repository.MongoTrainerRepo;

@Component
public class TrainerReceiver {
	
	@Autowired
    private MongoTrainerRepo repo;
	
	@JmsListener(destination = "InspectorFacadeQueue", containerFactory = "myFactory")
    public void receiveMessage(SentTrainer sentTrainer) {
        repo.save(sentTrainer);
    }

}
