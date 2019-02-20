package com.qa.InspectorFacade.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.InspectorFacade.persistence.domain.SentTrainee;
import com.qa.InspectorFacade.persistence.repository.MongoTraineeRepo;

@Component
public class TraineeReceiver {
	
	@Autowired
    private MongoTraineeRepo repo;
	
	@JmsListener(destination = "InspectorFacadeQueue", containerFactory = "myFactory")
    public void storeTraineesFromDatabase(SentTrainee sentTrainee) {
        repo.save(sentTrainee);
    }

}
