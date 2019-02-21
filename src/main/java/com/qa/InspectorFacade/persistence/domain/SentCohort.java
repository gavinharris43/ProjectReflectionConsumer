package com.qa.InspectorFacade.persistence.domain;


public class SentCohort {
	
	private Long cohortId;	
	private String cohortName;
	
	public SentCohort() {
		
	}
	
	public SentCohort(Long cohortid, String cohortName) {
		this.cohortId = cohortid;
		this.cohortName = cohortName;
	}
	
	
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
	
}
