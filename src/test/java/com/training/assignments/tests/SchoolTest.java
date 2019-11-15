package com.training.assignments.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.training.assignments.School;


public class SchoolTest {
	
	School school1,school2,school3,school4,school5;
	@Before
	public void setup() {
		school1 = new School("DY Patil","Pune","Pune","B");
		school2 = new School("CKT", "Panvel", "Raigad", "A");
		school3 = new School("DY Patil", "Pune", "Pune", "C");
		school4 = new School("CKT", "Panvel", "Raigad", "A");
		school5 = new School("MGM","Pune","Pune","B");
	}
	
	/**
	 * test for check size after adding new object in array
	 */
	@Test
	public void testToCheckSizeOfArrayList() {
		
		//Test For ArrayList
		List<Object> listOfschool = new ArrayList<Object>();
		listOfschool.add(school1);
		listOfschool.add(school2);
		listOfschool.add(school3);
		
		assertEquals(3, listOfschool.size());
	 }

	/**
	 * 1. comparing two object with same values but different raking grade
	 * 2. comparing different objcet  with different value
	 * 3. comparing two different object with all values are same
	 * 4. comparing two different object with same grade

	 */
	@Test
	public void testToCheckEqualityOfMultipleObject() {
		
		//Test For ArrayList
		List<Object> listOfschool = new ArrayList<Object>();
		listOfschool.add(school1);
		listOfschool.add(school2);
		listOfschool.add(school3);
		listOfschool.add(school4);
		listOfschool.add(school5);
		

		assertEquals(school1, school3);
		
		assertNotEquals(school1, school2);
		
		assertNotEquals(school1, school5);
		
		assertEquals(school2, school4);
	}


}
