package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID sectionID;
	private UUID studentID;
	private UUID enrollmentID;
	private double grade;
	
	private Enrollment(){
		this.enrollmentID = UUID.randomUUID();
	}
	public Enrollment(UUID courseSection, UUID student){
		this();
		this.studentID = student;
		this.sectionID = courseSection;
	}
	
	public UUID GetEnrollmentID(){
		return this.enrollmentID;
	}
	public UUID GetSectionID(){
		return this.sectionID;
	}
	public UUID GetStudentID(){
		return this.studentID;
	}
	
	public double GetGrade(){
		return this.grade;
	}
	public void SetGrade(double classAverage){
		this.grade = classAverage;
	}
}
