package intset;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntSetTest {
	
	//Tests defualt constructor
	@Test
	public void test1(){
		IntSet i1 = new IntSet();
		int[] x = {};
		assertArrayEquals(i1.getAll(), x);
	}

	//tests other constructor
	@Test
	public void test2(){
		IntSet i2 = new IntSet(new int[] {2,4,6,8,10});

		assertArrayEquals(i2.getAll(),new int[] {2,4,6,8,10});
	
	}

	//tests the remove function
	@Test
	public void test3(){
		IntSet i3 = new IntSet(new int[] {2,4,6,8,10});
		i3.remove(6);
		assertArrayEquals(i3.getAll(),new int[] {2,4,8,10});	

	}

	//tests the isIn function for both true and false
	@Test
	public void test4(){
		IntSet i4 = new  IntSet( new int[] {2,4,6,8,10});
		
		assertFalse(i4.isIn(3));
		assertTrue(i4.isIn(2));

	}

	//tests the size function
	@Test
	public void test5(){
		IntSet i5 = new IntSet( new int[] {2,4,6,8,10});
		
		assertTrue( i5.size() == 5);

	}


}
