package com.cisc181.core;

import java.util.ArrayList;
import java.util.UUID;

public class Course extends Semester {
	private UUID courseID;
	private String courseName;
	private int gradePoints;

	public Course() {
		super();
		this.courseID = UUID.randomUUID();
	}

	public Course(String courseTitle) {
		this();
		this.courseName = courseTitle;
	}

	public Course(String courseTitle, int gradePoint) {
		this(courseTitle);
		this.gradePoints = gradePoint;
	}

	public UUID GetCourseID() {
		return this.courseID;
	}

	public String GetCourseName() {
		return this.courseName;
	}

	public void SetCourseName(String courseTitle) {
		this.courseName = courseTitle;
	}

	public int GetGradePoints() {
		return this.gradePoints;
	}

	public void SetGradePoints(int gradePoint) {
		this.gradePoints = gradePoint;
	}
	
	public static double AverageGrade(ArrayList<Double> classGrades){
		Double totalClassGrade = 0.0;
		for(Double grades : classGrades){
			totalClassGrade += grades;
		}
		Double dataPoints = (double) classGrades.size();
		return totalClassGrade/dataPoints;
	}

}
