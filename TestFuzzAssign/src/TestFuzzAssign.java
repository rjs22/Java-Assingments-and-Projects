import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class TestFuzzAssign {
	
	DLLImp test;
	
	@Before
	public void setup(){
		test = new DLLImp();
	}

	@Test
	public void testAddStart(){
		test.addAtStart("alpha");
		assertEquals("test should equal alpha", "alpha", test.elementAt(0));
		test.addAtStart("bravo");
		assertEquals("test should equal bravo", "bravo", test.elementAt(0));
	}
	
	@Test
	public void testGetSize(){
		test.addAtStart("alpha");
		test.insert("bravo", 1);
		test.addAtEnd("charlie");
		assertEquals("test should equal size 3", 3, test.getSize());
	}
	
	@Test
	public void testInsertAtOne(){
		test.insert("alpha", 1);
		assertEquals("test should equal alpha", "alpha", test.elementAt(1));	
	}
	
	@Test
	public void testInsertSecondElement(){
		test.insert("alpha", 1);
		test.insert("bravo", 2);
		assertEquals("test should equal alpha", "alpha", test.elementAt(1));
		assertEquals("test should equal bravo", "bravo", test.elementAt(2));
	}
	
	@Test
	public void testInsertAtZero(){
		test.insert("alpha", 0);
		assertEquals("test should equal alpha", "alpha", test.elementAt(0));
	}
}
