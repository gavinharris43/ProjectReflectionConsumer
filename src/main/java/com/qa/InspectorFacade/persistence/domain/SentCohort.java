package com.qa.InspectorFacade.persistence.domain;


public class SentCohort {
	
	private Long cohortId;	
	private String cohortName;
	
	
	public String getCohortName() {
		return cohortName;
	}

	public void setCohortName(String cohortName) {
		this.cohortName = cohortName;
	}
	
	public Long getCohortId() {
		return cohortId;
	}
	
	public void setCohortId(Long cohortId) {
		this.cohortId = cohortId;
	}
	
	public SentTrainee getSentTrainee() {
		return sentTrainee;
	}
	
	public void setSentTrainee(SentTrainee sentTrainee) {
		this.sentTrainee = sentTrainee;
	}
	
	private SentTrainee sentTrainee;
	
	public SentCohort() {
		
	}
	
	public SentCohort(Long cohortid, String cohortName) {
		this.cohortId = cohortid;
		this.cohortName = cohortName;
	}
}
