package com.training.assignments.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.training.assignments.Car;
import com.training.assignments.Laptop;

/**
 * @author swayadav
 *
 */
public class CarTest {
	
	Car car1, car2, car3, car4;
	@Before
	public void setup() {
		
		car1 = new Car("suzuki","bike","2000",60000);
		car2 = new Car("BMW", "AK", "2005", 3000000);
		car3 = new Car("suzuki","bike","2000",60000);
	}
	
	/**
	 * test for check size after adding new object in set .
	 * it will not add duplicates element in it
	 */
	@Test
	public void testToAddElementsInHashSetAndCheckSize() {
		Set<Object> set = new HashSet<Object>();
		set.add(car1);
		set.add(car2);
		set.add(car3);
		
		assertEquals(2, set.size());
	}
	
	/**
	 * test for check size after adding new object in set .
	 * it will not add duplicates element in it
	 */
	@Test
	public void testToAddElementsInHashSetWhichAlsoIncludeInitialCapacity() {
		car4 = new Car("Yammaha","bike","1999",50000);
		Set<Object> set = new HashSet<Object>(8);
		set.add(car1);
		set.add(car4);
		set.add(car3);
		set.add(car2);
		//System.out.println(set);
		assertEquals(3, set.size());
		
		//check elements inside set one by one by using iterator
		ArrayList<Object> list = new ArrayList<Object>(
			    Arrays.asList(car1,car2,car4));
		
	    int index = 0;
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			assertEquals(list.get(index), iterator.next());
			index++;
		}
		
	}
	
	
	/**
	 * stores element in ascending order
	 */
	@Test
	public void testForSortCarObjectInAscendingOrder() {
		car4 = new Car("Yammaha","bike","1999",50000);
		Set<Car> set = new TreeSet<Car>();
		set.add(car1);
		set.add(car4);
		set.add(car3);
		set.add(car2);
		
		ArrayList<Object> list = new ArrayList<Object>(
			    Arrays.asList(car4,car1,car2));
		
	    int index = 0;
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			assertEquals(list.get(index), iterator.next());
			index++;
		}
		
	}
	
	
	/**
	 * sort list in natural order
	 */
	@Test
	public void testToSortElementInAscendingOfHashSet() {
		car4 = new Car("Yammaha","bike","1999",50000);
		List<Car> list  = new ArrayList<Car>();
		list.add(car1);
		list.add(car4);
		list.add(car3);
		list.add(car2);
		
		Collections.sort(list);
		

		ArrayList<Object> list1 = new ArrayList<Object>(
			    Arrays.asList(car4,car1,car2));
		
	    int index = 0;
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			assertEquals(list.get(index), iterator.next());
			index++;
		}
	}
	
	
	
}
