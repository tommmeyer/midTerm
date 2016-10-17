package com.cisc181.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Student extends Person {

	private eMajor Major;
	private UUID StudentID;
	
	public eMajor getMajor ( )
    {
        return this.Major;
    }
    public void setMajor (eMajor Major)
    {
        this.Major = Major;    
    }
    
    public UUID getStudentID(){
    	return this.StudentID;
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
			String Address, String Phone_number, String Email) throws PersonException
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.StudentID = UUID.randomUUID();
		this.Major = Major;
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
	
	public static double GetGPA(ArrayList<Integer> GPAPoints){
		double gradePoints =0;
		for (int i =0; i<GPAPoints.size();i=i+2){
			gradePoints += (double)GPAPoints.get(i);
		}
		double totalCourses=0;
		for (int i =1; i<GPAPoints.size();i=i+2){
			totalCourses += (double)GPAPoints.get(i);
		}
		return gradePoints/totalCourses;
	}
}