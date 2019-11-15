package com.training.assignments.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import com.training.assignments.Laptop;


/**
 * @author swayadav
 *
 */
public class LaptopTest {

	/**
	 * check size of an different collection
	 */
	Laptop laptop1,laptop2,laptop3,laptop4;
	@Before
	public void setup() {
		laptop1 = new Laptop("dell", "dell1500", "window", "i5");
		laptop2 = new Laptop("dell", "dell1500", "Linux", "i7");
		laptop3 = new Laptop("lenovo", "L480", "window", "i3");
	}
	
	/**
	 * test for check size after adding new object in array
	 */
	@Test
	public void testToCheckSizeOfArrayList() {
		
		//Test For ArrayList
		List<Object> listOfLaptop = new ArrayList<Object>();
		listOfLaptop.add(laptop1);
		listOfLaptop.add(laptop2);
		listOfLaptop.add(laptop3);
		
		assertEquals(3, listOfLaptop.size());
	 }
	
	/**
	 * test for check size after adding new object in linked list
	 */
	@Test
	public void testToCheckSizeOfLinkedList() {
		
		//Test For ArrayList
		List<Object> linkedList = new LinkedList<Object>();
		linkedList.add(laptop1);
		linkedList.add(laptop2);
		linkedList.add(laptop3);
		assertEquals(3, linkedList.size());
		assertEquals(laptop2, linkedList.get(1));
	 }
	
	
	
	/**
	 * test for equality of two different object with same company and model values
	 */
	@Test
	public void testToCheckEqualityOfTwoDifferentObjectWithCompanyAndModelHaveSameValue() {
		
		//Test For ArrayList
		List<Object> listOfLaptop = new ArrayList<Object>();
		listOfLaptop.add(laptop1);
		listOfLaptop.add(laptop2);
		listOfLaptop.add(laptop3);
		
		assertEquals(listOfLaptop.get(0), listOfLaptop.get(1));
	 }
	
	/**
	 * test for equality of two different object with same os and processor values
	 */
	@Test
	public void testToCheckEqualityOfTwoDifferentObjectWithOSAndProcessorHaveSameValue() {
		laptop4 = new Laptop("acer", "acer1", "window", "i3");
		//Test For ArrayList
		List<Object> listOfLaptop = new ArrayList<Object>();
		listOfLaptop.add(laptop1);
		listOfLaptop.add(laptop4);
		listOfLaptop.add(laptop3);
		
		assertNotEquals(listOfLaptop.get(1), listOfLaptop.get(2));
	 }
	
	/**
	 * test for equality of two different object wit different values
	 */
	@Test
	public void testToCheckEqualityOfTwoDifferentObjectWithDifferentValue() {
		
		//Test For ArrayList
		List<Object> listOfLaptop = new ArrayList<Object>();
		listOfLaptop.add(laptop1);
		listOfLaptop.add(laptop2);
		listOfLaptop.add(laptop3);	
		assertFalse(listOfLaptop.get(0).equals(listOfLaptop.get(2)));
	 }
	
	/**
	 * test for equality of two different objects with same values 
	 * It return false because we check equality of only model and company
	 */
	@Test
	public void testToCheckEqualityOfTwoDifferentObjectWithAllSameValue() {
		laptop4 = new Laptop("lenovo", "L480", "window", "i3");
		//Test For ArrayList
		List<Object> listOfLaptop = new ArrayList<Object>();
		listOfLaptop.add(laptop3);
		listOfLaptop.add(laptop4);
		assertTrue(listOfLaptop.get(0).equals(listOfLaptop.get(1)));
	 }
	
	

	/**
	 * test for equality of two different objects with same values 
	 * It return true if two method object having same hashcode and values
	 */
	@Test
	public void testToCheckEqualityOfTwoDifferentObjectWithSameValueOfHashCode() {
		laptop4 = new Laptop("lenovo", "L480", "window", "i3");
		//Test For ArrayList
		List<Object> listOfLaptop = new ArrayList<Object>();
		listOfLaptop.add(laptop3);
		listOfLaptop.add(laptop4);
		
		assertTrue(listOfLaptop.get(1).hashCode()==listOfLaptop.get(0).hashCode());
	 }
	
	
	/**
	 * test for equality of two different objects with same values 
	 * It return false because we check equality of only model and company
	 */
	@Test
	public void testToCheckEqualityOfTwoDifferentObjectWithDifferentValueOfHashCode() {
		//Test For ArrayList
		List<Object> listOfLaptop = new ArrayList<Object>();
		listOfLaptop.add(laptop3);
		listOfLaptop.add(laptop1);
		
		assertFalse(listOfLaptop.get(1).hashCode()==listOfLaptop.get(0).hashCode());
	 }
	
	@Test
	public void testToIteratethroughtArrayList() {
		List<Object> listOfLaptop = new ArrayList<Object>();
		listOfLaptop.add(laptop1);
		listOfLaptop.add(laptop3);
		listOfLaptop.add(laptop2);
		
		ArrayList<Object> list = new ArrayList<Object>(
			    Arrays.asList(laptop1,laptop3,laptop2));
		
		Iterator iterator = listOfLaptop.iterator();
		int i=0;
		while(iterator.hasNext()) {
			assertEquals(list.get(i), iterator.next());
			i++;
		}
	}
	
	
	/**
	 * test for iterating through linkedlist .
	 */
	@Test
	public void testToPrintLinkedListItem() {
		List<Object> linkedList = new LinkedList<Object>();
		linkedList.add(laptop1);
		linkedList.add(laptop2);
		linkedList.add(laptop3);
		
		ArrayList<Object> list = new ArrayList<Object>(
			    Arrays.asList(laptop1,laptop2,laptop3));
		
		Iterator iterator = linkedList.iterator();
		int i=0;
		while(iterator.hasNext()) {
			assertEquals(list.get(i), iterator.next());
			i++;
		}

		
	}
	
	/**
	 * test for check size after adding new object in set .
	 * it will not add duplicates element in it
	 */
	@Test
	public void testToAddElementsInHashSetAndCheckSize() {
		laptop4 = new Laptop("lenovo", "L480", "window", "i3");
		Set<Object> set = new HashSet<Object>();
		set.add(laptop1);
		set.add(laptop2);
		set.add(laptop3);
		set.add(laptop4);
		
		assertEquals(3, set.size());
	}

	
 }
