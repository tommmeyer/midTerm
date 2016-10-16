package com.cisc181.core;

public class PersonException extends Exception {
private Person problemPerson;
	

	public PersonException(Person problem, String errorMessage) {
		this.problemPerson = problem;
		System.out.println(errorMessage);
	}

	public Person GetProblemPerson(){
		 return this.problemPerson;
	}
}

