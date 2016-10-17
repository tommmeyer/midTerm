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

import com.cisc181.eNums.eTitle;

public class Staff_Test {

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
	public void test() throws PersonException {
		@SuppressWarnings("deprecation")
		Date austinsBirthday = new Date(97, 5, 2);
		@SuppressWarnings("deprecation")
		Date austinsHireDate = new Date(100, 11, 6);
		Faculty austinPowers = new Faculty("Austin", "Danger", "Powers", austinsBirthday,
				"1 Downtown Abbey, London UK 02304", "(800)-755-0939",
				"internationalmanofmystery@britishMinistryOfDefense", "Monday's 2-5", 0, 100000.00, austinsHireDate);
		@SuppressWarnings("deprecation")
		Date evilsBirthday = new Date(97, 11, 5);
		@SuppressWarnings("deprecation")
		Date evilsHireDate = new Date(103, 3, 7);
		Faculty doctorEvil = new Faculty("Doctor", "I didn't go to 6 years of Evil Medical School to be called Mr.",
				"Evil", evilsBirthday, "1 Underwater Layer, Pacific Ocean", "(800)-867-5309",
				"iwilltakeovertheworld@viacom.com", "Saturday's 8-12", 2, 1000000.00, evilsHireDate);
		@SuppressWarnings("deprecation")
		Date zoolanderBirthday = new Date(92, 7, 5);
		@SuppressWarnings("deprecation")
		Date zoolanderHireDate = new Date(101, 10, 12);
		Staff derekZoolander = new Staff("Derek", "I can't turn left", "Zoolander", zoolanderBirthday,
				"2034 Center for Children who can't read good and want to learn to do other things good too, New York, New York 20130",
				"(212)-002-0000", "ithinkihavethelung@ballstineModels.com", "Tuesday's 12-2", 0, 100.00,
				zoolanderHireDate, eTitle.MR);
		@SuppressWarnings("deprecation")
		Date burgendyBirthday = new Date(92, 5, 11);
		@SuppressWarnings("deprecation")
		Date burgendyHireDate = new Date(104, 3, 2);
		Staff ronBurgendy = new Staff("Ron", "You Stay classy San Diego", "Burgendy", burgendyBirthday,
				"1423 Glass Case of Emotion, San Diego, California", "(619)-234-3241", "ilovescotch@channel4new.com",
				"monday's 6-8", 0, 73420.00, burgendyHireDate, eTitle.MR);
		@SuppressWarnings("deprecation")
		Date bobbyBirthday = new Date(88, 4, 10);
		@SuppressWarnings("deprecation")
		Date bobbyHireDate = new Date(105, 2, 1);
		Staff rickyBobby = new Staff("Ricky", "Shake and Bake", "Bobby", bobbyBirthday,
				"1 Super Speedway Dr, Talladega, Alabama 53231", "(256)-111-1111",
				"ifyournotfirstyourlast@dennitracing.com", "Sunday's 12-4", 0, 10.00, bobbyHireDate, eTitle.DOCTOR);
		ArrayList<Employee> universityStaff = new ArrayList<Employee>();
		universityStaff.add(austinPowers);
		universityStaff.add(doctorEvil);
		universityStaff.add(derekZoolander);
		universityStaff.add(ronBurgendy);
		universityStaff.add(rickyBobby);
		double totalSalary = 0;
		int totalEmployees = universityStaff.size();
		for (Employee employee : universityStaff) {
			double money = employee.getSalary();
			totalSalary += money;
		}
		double averageSalary = totalSalary / totalEmployees;
		assertEquals(averageSalary, 234706.0, .01);
	}

	@Test(expected = PersonException.class)
	public void InvalidPhoneNumberTest() throws PersonException {
		@SuppressWarnings("deprecation")
		Date bluesBirthday = new Date(70, 0, 13);
		@SuppressWarnings("deprecation")
		Date bluesHireDate = new Date(90, 8, 20);
		Staff elwoodBlues = new Staff("Elwood", "We're on a mission...from God", "Blues", bluesBirthday,
				"200 Corrections Center, Jolliet Illinois, 40532", "(312)434-3234", "thenewbuicksarein@thepenguin.org",
				"Thursday's 2-4", 0, 12320.00, bluesHireDate, eTitle.MR);

	}

	@Test(expected = PersonException.class)
	public void InvalidBirthdayTest() throws PersonException {
		@SuppressWarnings("deprecation")
		Date brownBirthday = new Date(4, 8, 13);
		@SuppressWarnings("deprecation")
		Date brownHireDate = new Date(117, 5, 20);
		Staff emmitBrown = new Staff("Emmit", "1.21 Gigawatts?!?!?!?!?!?", "Brown", brownBirthday,
				"1640 Riverside Dr, Hill Valley, Minnesota 32434", "(919)-412-7656",
				"thisstupidthingdoesntwork@brownlabs.com", "All the time", 0, 123230.00, brownHireDate, eTitle.DOCTOR);

	}
}
