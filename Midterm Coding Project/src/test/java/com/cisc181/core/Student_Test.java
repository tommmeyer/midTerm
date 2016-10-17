package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void classgradetest() throws PersonException {
		ArrayList<Semester> semesterList = new ArrayList<Semester>();
		ArrayList<Course> courseList= new ArrayList<Course>();
		ArrayList<Section> sectionList = new ArrayList<Section>();
		@SuppressWarnings("deprecation")
		Date fallStartDate = new Date(116, 7, 29);
		@SuppressWarnings("deprecation")
		Date fallEndDate = new Date(116, 11, 16);
		Semester fall = new Semester(fallStartDate,fallEndDate);
		@SuppressWarnings("deprecation")
		Date springStartDate = new Date(117,1,6);
		@SuppressWarnings("deprecation")
		Date springEndDate = new Date(117,4, 26);
		Semester spring = new Semester(springStartDate,springEndDate);
		semesterList.add(fall);
		semesterList.add(spring);
		Course econometrics = new Course("econometrics", 3);
		Course compSci = new Course("Computer Science", 3);
		Course chemistry = new Course("chemistry", 3);
		courseList.add(econometrics);
		courseList.add(compSci);
		courseList.add(chemistry);
		int roomNumber = 100;
		for(Semester semester: semesterList){
			for(Course course: courseList){
				Section section = new Section(roomNumber);
				roomNumber++;
				sectionList.add(section);
			}
		}
		
		ArrayList<Student> students = new ArrayList<Student>();
		@SuppressWarnings("deprecation")
		Date jordansBday = new Date(63,1, 17);
		Student michaelJordan = new Student("Michael", "","Jordan",jordansBday,eMajor.BUSINESS, "1901 W Madison St, Chicago, IL 60612", "(919)-715-7957","mjordan@unc.edu" );
		@SuppressWarnings("deprecation")
		Date utleyBday = new Date(78,11, 17);
		Student chaseUtley = new Student("Chase", "Cameron","Utley",utleyBday,eMajor.NURSING, " 1 Citizens Bank Way, Philadelphia, PA 19148", "(213)-234-7343","cUtley@ucla.edu" );
		@SuppressWarnings("deprecation")
		Date girouxBday = new Date(88,0, 12);
		Student claudeGiroux = new Student("Claude", "","Giroux",girouxBday,eMajor.PHYSICS, "3601 South Broad Street Philadelphia Pa, 19148", "(215)-256-7577","cgiroux@umich.edu" );
		@SuppressWarnings("deprecation")
		Date deansBday = new Date(38,1, 28);
		Student deanSmith = new Student("Dean", "Edwards","Smith",deansBday,eMajor.COMPSI, "310 South Rd, Chapel Hill, NC 27514", "(919)-792-7432","dsmith@ku.edu" );
		@SuppressWarnings("deprecation")
		Date paigeBday = new Date(93,8, 11);
		Student marcusPaige = new Student("Marcus", "Taylor","Paige",paigeBday,eMajor.CHEM, "300 Skipper Bowles Dr, Chapel Hill, NC 27514", "(919)-923-4293","mpaige@unc.edu" );
		@SuppressWarnings("deprecation")
		Date flaccoBday = new Date(85,0, 16);
		Student joeFlacco = new Student("Joe", "Vincent","Flacco",flaccoBday,eMajor.NURSING, "1101 Russell St, Baltimore, MD 21230", "(302)-823-7281","jflacco@udel.edu" );
		@SuppressWarnings("deprecation")
		Date leeBday = new Date(78,7, 30);
		Student cliffLee = new Student("Cliff", "Phiefer","Lee",leeBday,eMajor.COMPSI, "1 Citizens Bank Way, Philadelphia, PA 19148", "(215)-823-8543","clee@ark.edu" );
		@SuppressWarnings("deprecation")
		Date brownBday = new Date(88,6, 10);
		Student antonioBrown = new Student("Antonio", "","Brown",brownBday,eMajor.BUSINESS, "100 Art Rooney Ave, Pittsburgh, PA 15212", "(412)-982-7621","abrown@cmu.edu" );
		@SuppressWarnings("deprecation")
		Date peppersBday = new Date(80,0, 18);
		Student juliusPeppers = new Student("Julius", "Frazier","Peppers",peppersBday,eMajor.PHYSICS, "104 Stadium Dr, Chapel Hill, NC 27514", "(919)-702-2350","jpeppers@unc.edu" );
		@SuppressWarnings("deprecation")
		Date pavelskiBday = new Date(84,6, 11);
		Student joePavelski = new Student("Joe", "James","Pavelski",pavelskiBday,eMajor.COMPSI, "525 W Santa Clara St, San Jose, CA 95113", "(408)-420-5032","jpavelski@wisc.edu" );
		students.add(michaelJordan);
		students.add(chaseUtley);
		students.add(deanSmith);
		students.add(marcusPaige);
		students.add(joeFlacco);
		students.add(cliffLee);
		students.add(antonioBrown);
		students.add(juliusPeppers);
		students.add(joePavelski);
		students.add(claudeGiroux);
		ArrayList<Enrollment> enrollies = new ArrayList<Enrollment>();
		for(Section section: sectionList){
			for(Student student: students){
				Enrollment inclass = new Enrollment(section.GetSectionID(),student.getStudentID());
				enrollies.add(inclass);
			}
		}
		enrollies.get(0).SetGrade(92);
		enrollies.get(1).SetGrade(88);
		enrollies.get(2).SetGrade(95);
		enrollies.get(3).SetGrade(85);
		enrollies.get(4).SetGrade(80);
		enrollies.get(5).SetGrade(100);
		enrollies.get(6).SetGrade(91);
		enrollies.get(7).SetGrade(89);
		enrollies.get(8).SetGrade(82);
		enrollies.get(9).SetGrade(98);
		enrollies.get(10).SetGrade(85);
		enrollies.get(11).SetGrade(85);
		enrollies.get(12).SetGrade(70);
		enrollies.get(13).SetGrade(100);
		enrollies.get(14).SetGrade(81);
		enrollies.get(15).SetGrade(89);
		enrollies.get(16).SetGrade(78);
		enrollies.get(17).SetGrade(92);
		enrollies.get(18).SetGrade(76);
		enrollies.get(19).SetGrade(94);
		enrollies.get(20).SetGrade(94);
		enrollies.get(21).SetGrade(90);
		enrollies.get(22).SetGrade(98);
		enrollies.get(23).SetGrade(86);
		enrollies.get(24).SetGrade(91);
		enrollies.get(25).SetGrade(93);
		enrollies.get(26).SetGrade(99);
		enrollies.get(27).SetGrade(85);
		enrollies.get(28).SetGrade(91);
		enrollies.get(29).SetGrade(93);
		enrollies.get(30).SetGrade(83);
		enrollies.get(31).SetGrade(77);
		enrollies.get(32).SetGrade(88);
		enrollies.get(33).SetGrade(72);
		enrollies.get(34).SetGrade(90);
		enrollies.get(35).SetGrade(70);
		enrollies.get(36).SetGrade(95);
		enrollies.get(37).SetGrade(65);
		enrollies.get(38).SetGrade(81);
		enrollies.get(39).SetGrade(79);
		enrollies.get(40).SetGrade(95);
		enrollies.get(41).SetGrade(95);
		enrollies.get(42).SetGrade(100);
		enrollies.get(43).SetGrade(90);
		enrollies.get(44).SetGrade(92);
		enrollies.get(45).SetGrade(98);
		enrollies.get(46).SetGrade(94);
		enrollies.get(47).SetGrade(96);
		enrollies.get(48).SetGrade(95);
		enrollies.get(49).SetGrade(95);
		enrollies.get(50).SetGrade(81);
		enrollies.get(51).SetGrade(79);
		enrollies.get(52).SetGrade(75);
		enrollies.get(53).SetGrade(75);
		enrollies.get(54).SetGrade(100);
		enrollies.get(55).SetGrade(50);
		enrollies.get(56).SetGrade(90);
		enrollies.get(57).SetGrade(60);
		enrollies.get(58).SetGrade(78);
		enrollies.get(59).SetGrade(72);
		ArrayList<Double> classGrade = new ArrayList<Double>();
		for(int i =0;i<10;i++ ){
			classGrade.add(enrollies.get(i).GetGrade());
		}
		Course.AverageGrade(classGrade);
		assertEquals(Course.AverageGrade(classGrade), 90.0,.01);
	}
	@Test
	public void gpatest() throws PersonException {
		ArrayList<Semester> semesterList = new ArrayList<Semester>();
		ArrayList<Course> courseList= new ArrayList<Course>();
		ArrayList<Section> sectionList = new ArrayList<Section>();
		@SuppressWarnings("deprecation")
		Date fallStartDate = new Date(116, 7, 29);
		@SuppressWarnings("deprecation")
		Date fallEndDate = new Date(116, 11, 16);
		Semester fall = new Semester(fallStartDate,fallEndDate);
		@SuppressWarnings("deprecation")
		Date springStartDate = new Date(117,1,6);
		@SuppressWarnings("deprecation")
		Date springEndDate = new Date(117,4, 26);
		Semester spring = new Semester(springStartDate,springEndDate);
		semesterList.add(fall);
		semesterList.add(spring);
		Course econometrics = new Course("econometrics", 3);
		Course compSci = new Course("Computer Science", 3);
		Course chemistry = new Course("chemistry", 4);
		courseList.add(econometrics);
		courseList.add(compSci);
		courseList.add(chemistry);
		int roomNumber = 100;
		for(Semester semester: semesterList){
			for(Course course: courseList){
				Section section = new Section(roomNumber);
				roomNumber++;
				sectionList.add(section);
			}
		}
		
		ArrayList<Student> students = new ArrayList<Student>();
		@SuppressWarnings("deprecation")
		Date jordansBday = new Date(63,1, 17);
		Student michaelJordan = new Student("Michael", "","Jordan",jordansBday,eMajor.BUSINESS, "1901 W Madison St, Chicago, IL 60612", "(919)-715-7957","mjordan@unc.edu" );
		@SuppressWarnings("deprecation")
		Date utleyBday = new Date(78,11, 17);
		Student chaseUtley = new Student("Chase", "Cameron","Utley",utleyBday,eMajor.NURSING, " 1 Citizens Bank Way, Philadelphia, PA 19148", "(213)-234-7343","cUtley@ucla.edu" );
		@SuppressWarnings("deprecation")
		Date girouxBday = new Date(88,0, 12);
		Student claudeGiroux = new Student("Claude", "","Giroux",girouxBday,eMajor.PHYSICS, "3601 South Broad Street Philadelphia Pa, 19148", "(215)-256-7577","cgiroux@umich.edu" );
		@SuppressWarnings("deprecation")
		Date deansBday = new Date(38,1, 28);
		Student deanSmith = new Student("Dean", "Edwards","Smith",deansBday,eMajor.COMPSI, "310 South Rd, Chapel Hill, NC 27514", "(919)-792-7432","dsmith@ku.edu" );
		@SuppressWarnings("deprecation")
		Date paigeBday = new Date(93,8, 11);
		Student marcusPaige = new Student("Marcus", "Taylor","Paige",paigeBday,eMajor.CHEM, "300 Skipper Bowles Dr, Chapel Hill, NC 27514", "(919)-923-4293","mpaige@unc.edu" );
		@SuppressWarnings("deprecation")
		Date flaccoBday = new Date(85,0, 16);
		Student joeFlacco = new Student("Joe", "Vincent","Flacco",flaccoBday,eMajor.NURSING, "1101 Russell St, Baltimore, MD 21230", "(302)-823-7281","jflacco@udel.edu" );
		@SuppressWarnings("deprecation")
		Date leeBday = new Date(78,7, 30);
		Student cliffLee = new Student("Cliff", "Phiefer","Lee",leeBday,eMajor.COMPSI, "1 Citizens Bank Way, Philadelphia, PA 19148", "(215)-823-8543","clee@ark.edu" );
		@SuppressWarnings("deprecation")
		Date brownBday = new Date(88,6, 10);
		Student antonioBrown = new Student("Antonio", "","Brown",brownBday,eMajor.BUSINESS, "100 Art Rooney Ave, Pittsburgh, PA 15212", "(412)-982-7621","abrown@cmu.edu" );
		@SuppressWarnings("deprecation")
		Date peppersBday = new Date(80,0, 18);
		Student juliusPeppers = new Student("Julius", "Frazier","Peppers",peppersBday,eMajor.PHYSICS, "104 Stadium Dr, Chapel Hill, NC 27514", "(919)-702-2350","jpeppers@unc.edu" );
		@SuppressWarnings("deprecation")
		Date pavelskiBday = new Date(84,6, 11);
		Student joePavelski = new Student("Joe", "James","Pavelski",pavelskiBday,eMajor.COMPSI, "525 W Santa Clara St, San Jose, CA 95113", "(408)-420-5032","jpavelski@wisc.edu" );
		students.add(michaelJordan);
		students.add(chaseUtley);
		students.add(deanSmith);
		students.add(marcusPaige);
		students.add(joeFlacco);
		students.add(cliffLee);
		students.add(antonioBrown);
		students.add(juliusPeppers);
		students.add(joePavelski);
		students.add(claudeGiroux);
		ArrayList<Enrollment> enrollies = new ArrayList<Enrollment>();
		for(Section section: sectionList){
			for(Student student: students){
				Enrollment inclass = new Enrollment(section.GetSectionID(),student.getStudentID());
				enrollies.add(inclass);
			}
		}
		enrollies.get(0).SetGrade(92);
		enrollies.get(1).SetGrade(88);
		enrollies.get(2).SetGrade(95);
		enrollies.get(3).SetGrade(85);
		enrollies.get(4).SetGrade(80);
		enrollies.get(5).SetGrade(100);
		enrollies.get(6).SetGrade(91);
		enrollies.get(7).SetGrade(89);
		enrollies.get(8).SetGrade(82);
		enrollies.get(9).SetGrade(98);
		enrollies.get(10).SetGrade(85);
		enrollies.get(11).SetGrade(85);
		enrollies.get(12).SetGrade(70);
		enrollies.get(13).SetGrade(100);
		enrollies.get(14).SetGrade(81);
		enrollies.get(15).SetGrade(89);
		enrollies.get(16).SetGrade(78);
		enrollies.get(17).SetGrade(92);
		enrollies.get(18).SetGrade(76);
		enrollies.get(19).SetGrade(94);
		enrollies.get(20).SetGrade(94);
		enrollies.get(21).SetGrade(90);
		enrollies.get(22).SetGrade(98);
		enrollies.get(23).SetGrade(86);
		enrollies.get(24).SetGrade(91);
		enrollies.get(25).SetGrade(93);
		enrollies.get(26).SetGrade(99);
		enrollies.get(27).SetGrade(85);
		enrollies.get(28).SetGrade(91);
		enrollies.get(29).SetGrade(93);
		enrollies.get(30).SetGrade(83);
		enrollies.get(31).SetGrade(77);
		enrollies.get(32).SetGrade(88);
		enrollies.get(33).SetGrade(72);
		enrollies.get(34).SetGrade(90);
		enrollies.get(35).SetGrade(70);
		enrollies.get(36).SetGrade(95);
		enrollies.get(37).SetGrade(65);
		enrollies.get(38).SetGrade(81);
		enrollies.get(39).SetGrade(79);
		enrollies.get(40).SetGrade(95);
		enrollies.get(41).SetGrade(95);
		enrollies.get(42).SetGrade(100);
		enrollies.get(43).SetGrade(90);
		enrollies.get(44).SetGrade(92);
		enrollies.get(45).SetGrade(98);
		enrollies.get(46).SetGrade(94);
		enrollies.get(47).SetGrade(96);
		enrollies.get(48).SetGrade(95);
		enrollies.get(49).SetGrade(95);
		enrollies.get(50).SetGrade(81);
		enrollies.get(51).SetGrade(79);
		enrollies.get(52).SetGrade(75);
		enrollies.get(53).SetGrade(75);
		enrollies.get(54).SetGrade(100);
		enrollies.get(55).SetGrade(50);
		enrollies.get(56).SetGrade(90);
		enrollies.get(57).SetGrade(60);
		enrollies.get(58).SetGrade(78);
		enrollies.get(59).SetGrade(72);
		ArrayList<Integer> gradeInfo = new ArrayList<Integer>();
		for(int i =0;i<600;i=i+10 ){
			Character gradeLetter = enrollies.get(i).GetGradeLetter();
			ArrayList<Integer> temp = Enrollment.GetGPAPoints(enrollies.get(i), gradeLetter);
			for(Integer tempNumber: temp){
				gradeInfo.add(tempNumber);
			}
		}
		assertEquals(Student.GetGPA(gradeInfo),3.5,.01);
	}
	@Test
	public void majorTest() throws PersonException {
		@SuppressWarnings("deprecation")
		Date jordansBday = new Date(63,1, 17);
		Student michaelJordan = new Student("Michael", "","Jordan",jordansBday,eMajor.BUSINESS, "1901 W Madison St, Chicago, IL 60612", "(919)-715-7957","mjordan@unc.edu" );
		michaelJordan.setMajor(eMajor.COMPSI);
		boolean truthteller = false;
		if (michaelJordan.getMajor().equals(eMajor.COMPSI)){
			truthteller = true;
		}
		assertTrue(truthteller);
	}
	
}