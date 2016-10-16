package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {

	private UUID semesterID;
	private Date startDate;
	private Date endDate;
	
	public Semester(){
		this.semesterID = UUID.randomUUID();
	}
	public Semester(Date semesterStartDate, Date semesterEndDate){
		this();
		this.startDate = semesterStartDate;
		this.endDate = semesterEndDate;
	}
	
	public UUID GetSemesterID(){
		return this.semesterID;
	}

	public Date GetStartDate(){
		return this.startDate;
	}
	public void SetStartDate(Date semesterStartDate){
		this.startDate = semesterStartDate;
	}
	
	public Date GetEndDate(){
		return this.endDate;
	}
	public void SetEndDate(Date semesterEndDate){
		this.endDate = semesterEndDate;
	}
}
