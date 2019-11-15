package com.training.assignments.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.training.assignments.Student;

public class StudentTest {
	Student student1,student2,student3;
	
	@Before
	public void setup(){
		student1 = new Student("Anagha","Mango");
		student2 = new Student("Shubra","Pipneapple");
		student3 = new Student("Krishna","Watermelon");


	}

	
	/**
	 * here check whether the hashmap follow order or not
	 */
	@Test
	public void testForCheckingWhetherCollectionFollowOrderOrNot() {
		
		List<Student> students = new ArrayList<Student>();
		students.add(student1);
		students.add(student3);
		students.add(student2);
		
		assertEquals(3, students.size());
		
		assertEquals(student1, students.get(0));
		assertEquals(student3, students.get(1));
		assertEquals(student2, students.get(2));
		
		
		
		//HashMap
		Map<String, String> studentMap = new HashMap<String, String>();
		studentMap.put("Anagha", "Apple");
		studentMap.put("Shubra","PineApple");
		studentMap.put("Krishna","Mango");
		studentMap.put("Anagha","Watermelon");

		
		assertEquals(3, studentMap.size());

	}
	
	/**
	 * test keys in hashmap
	 */
	@Test
	public void testToTestAllKeysInMap() {
		//HashMap
		Map<String, String> studentMap = new HashMap<String, String>();
		studentMap.put("Shubra","PineApple");
		studentMap.put("Krishna","Mango");
		studentMap.put("Anagha", "Apple");
		studentMap.put("Anagha","Watermelon");

		//check elements inside set one by one by using iterator
		ArrayList<Object> list = new ArrayList<Object>(
			    Arrays.asList("Shubra","Krishna","Anagha"));
		
	    int index = 0;
	    Set set =studentMap.keySet();
	    Iterator iterator = set.iterator();
	    while (iterator.hasNext()) {
	    	assertEquals(list.get(index), iterator.next());
	    	index+=1;
	    	}
	}
	
	/**
	 * iterate through values from hashmap
	 */
	@Test
	public void testToTestAllKeyValueFromHashMap() {
		//HashMap
		Map<String, String> studentMap = new HashMap<String, String>();
		studentMap.put("Shubra","PineApple");
		studentMap.put("Krishna","Mango");
		studentMap.put("Anagha", "Apple");
		studentMap.put("Anagha","Watermelon");

		//check elements inside set one by one by using iterator
		ArrayList<Object> list = new ArrayList<Object>(
			    Arrays.asList("PineApple","Mango","Watermelon"));
		
	    int index = 0;
	    Collection<String> set =studentMap.values();
	    Iterator iterator = set.iterator();
	    while (iterator.hasNext()) {
	    	assertEquals(list.get(index), iterator.next());
	    	index+=1;
	    	
		}
	}
	
	 /**
	 * adding duplicate keyvalue in hash it overide value of first value to new value
	 */
	@Test
		public void testToTestForAddingDuplicateKeyWithDifferentValue() {
			//HashMap
			Map<String, String> studentMap = new HashMap<String, String>();
			studentMap.put("Shubra","PineApple");
			studentMap.put("Krishna","Mango");
			studentMap.put("Anagha", "Apple");
			studentMap.put("Anagha","Watermelon");
			assertEquals("Watermelon", studentMap.get("Anagha"));
			
			assertNotEquals("Apple", studentMap.get("Anagha"));			
		    
	}
	
	
	/**
	 * iterate through hashmap and check key and value pairs
	 */
	@Test
	public void testAllKeyAndValuesInsideArrayForCheckingOrder() {
		Map<String, String> studentMap = new HashMap<String, String>();
		studentMap.put("Anagha", "Apple");
		studentMap.put("Shubra","PineApple");
		studentMap.put("Krishna","Mango");
		studentMap.put("Anagha", "Watermelon");

		
		HashMap<String,String> tempMap = new HashMap<String, String>(){{
		     put("Shubra", "PineApple");
		     put("Krishna", "Mango");
		     put("Anagha", "Watermelon");
		}};
	
		
		assertEquals(tempMap.entrySet(), studentMap.entrySet());
		
	}
	

}
