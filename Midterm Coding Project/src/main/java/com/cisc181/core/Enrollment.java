package com.cisc181.core;

import java.util.ArrayList;
import java.util.UUID;

public class Enrollment extends Section {
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
	
	public Character GetGradeLetter(){
		Character letterGrade;
		if (this.grade>=90){
			letterGrade = 'A';
			return letterGrade;
		}
		else if (this.grade>= 80){
			letterGrade = 'B';
			return letterGrade;
		}
		else if (this.grade>= 70){
			letterGrade = 'C';
			return letterGrade;
		}
		else if (this.grade>= 60){
			letterGrade = 'D';
			return letterGrade;
		}
		else{
			letterGrade = 'F';
			return letterGrade;
		}
	}
	public static ArrayList<Integer> GetGPAPoints(Enrollment courseEnrollment, Character letterGrade){
		Integer courseStrength = courseEnrollment.GetGradePoints();
		Integer gradeWeight=-1;
		switch (letterGrade){
		case 'A':
		gradeWeight = 4;
		break;
		case 'B':
			gradeWeight = 3;
			break;
		case 'C':
			gradeWeight = 2;
			break;
		case 'D':
			gradeWeight = 1;
			break;
		case 'F':
			gradeWeight = 0;
			break;
		}
		ArrayList<Integer> gradeInfo = new ArrayList<Integer>();
		gradeInfo.add(gradeWeight*courseStrength);
		gradeInfo.add(courseStrength);
		return gradeInfo;
	}
	
}
