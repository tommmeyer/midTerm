package com.cisc181.core;

import java.util.UUID;

public class Section extends Course{
	private UUID sectionID;
	private int roomID;
	private UUID courseID = super.GetCourseID();
	private UUID semesterID = super.GetSemesterID();
	
	public Section(){
		this.sectionID = UUID.randomUUID();
	}
	public Section (int roomNumber ){
		this();
		this.roomID = roomNumber;
	}
	
	public UUID GetSectionID(){
		return this.sectionID;
	}
	public UUID GetCourseID(){
		return this.courseID;
	}
	public UUID GetSemesterID(){
		return this.semesterID;
	}
	
	public int GetRoomID(){
		return this.roomID;
	}
	public void SetRoomID(int roomNumber){
		this.roomID = roomNumber;
	}
	


}
