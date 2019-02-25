package com.qa.InspectorFacade.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.InspectorFacade.persistence.domain.SentReflectionForm;
import com.qa.InspectorFacade.persistence.repository.MongoFormRepo;

@Component
public class FormReceiver {

	@Autowired
	private MongoFormRepo repo;
	
	@JmsListener(destination = "FormQueue", containerFactory = "myFactory")
    public void receiveMessage(SentReflectionForm sentForm) {
        repo.save(sentForm);
    }
	
}
