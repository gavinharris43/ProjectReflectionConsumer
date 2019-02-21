package com.qa.InspectorFacade.persistence.domain;

public class SentTrainee {

	private Long traineeId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	private String startDate;
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Long getTraineeId() {
		return traineeId;
	}
	
	public void setTraineeId(Long traineeId){
		this.traineeId = traineeId;
	}
	
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	
	public SentTrainee() {}
	
	public SentTrainee(Long traineeid, String firstName, String lastName, String email, String password, String startDate) {
		this.traineeId = traineeid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.startDate = startDate;
	}


}
