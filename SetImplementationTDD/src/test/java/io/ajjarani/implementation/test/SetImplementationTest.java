/**
 * 
 */
package io.ajjarani.implementation.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import io.ajjarani.implementation.SetImplemenation;

/**
 * @author A.Ajjarani
 *
 */
public class SetImplementationTest {
	
	private SetImplemenation set;
	
	///////////////////////////////////////////////////////////////////////////
	/*
	* Below methods run Before the Testing methods are complete
	*/
	//////////////////////////////////////////////////////////////////////////
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		set = new SetImplemenation();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	///////////////////////////////////////////////////////////////////////////
	/*
	* Below methods are Testing methods for each implementation feature are 
	* Work/Component to be Built Class
	* 
	*/
	//////////////////////////////////////////////////////////////////////////
	
	@Test
	public void isEmptyTest(){	
	assertEquals(true, set.isEmpty());	
	
	set.contis();
	}
	
	@Test
	public void getSizeTest(){
		assertEquals(0, set.size());
	}
	
	
	
	@Test
	public void addTest(){			
		assertEquals(true, set.add(10));
		
		String x = "Megha";
		assertEquals(true, set.addNew(x));
	}
	
	
	@Test
	public void containsTest(){		
		set.add("Ajith");	
		assertEquals(true, set.contains("Ajith"));	
		
		set.add(1);	
		assertEquals(false, set.contains(2));
	}
	
	
	/*@Test
	public void removeTest(){
		Object o = null;
		assertEquals(true, set.remove(o));
	}
	
	@Test
	public void containsAllTest(){
		Object o = null;
		assertEquals(true, set.containsAll(o));
	}
	
	@Test
	public void addAllTest(){
		Object o = null;
		assertEquals(true, set.addAll(o));
	}
	
	
	@Test
	public void retainAllTest(){
		Object o = null;
		assertEquals(true, set.retainAll(o));
	}
	
	
	@Test
	public void removeAllTest(){
		Object o = null;
		assertEquals(true, set.removeAll(o));
	}
	
	@Test
	public void clearTest(){
		Object o = null;
		assertEquals(true, set.clear(o));
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	///////////////////////////////////////////////////////////////////////////
	/*
	 * Below methods run after the Testing methods are complete
	 */
	//////////////////////////////////////////////////////////////////////////

	/**
	 * @throws java.lang.Exception
	 */
	/**
	 * @throws Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	
	

}
