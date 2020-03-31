import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTester {
	
    private GradeBook obj1;
	private GradeBook obj2;

	@Before
	public void setUp() throws Exception {
		
		// Create two objects of GradeBook to hold 5 scores
		obj1 = new GradeBook(5);
		obj2 = new GradeBook(5);

		// Call addScore method for each of the GradeBook objects at least twice
		obj1.addScore(95.5);
		obj1.addScore(100.0);
		obj1.addScore(20.5);
		
		obj2.addScore(80.0);
		obj2.addScore(98.0);
		obj2.addScore(100.0);
		obj2.addScore(79.5);
		obj2.addScore(30.5);

	}

	@After
	public void tearDown() throws Exception {
		
		// Set two objects of GradeBook to null
		obj1 = null;
		obj2 = null;
	}

	

	@Test
	public void testAddScore() {
		
		assertTrue(obj1.toString().equals("95.5 100.0 20.5 "));
	    assertTrue(obj2.toString().equals("80.0 98.0 100.0 79.5 30.5 "));
	   
	    /*System.out.println("testAddScore");
	    System.out.println(obj1.getScoreSize());
	    System.out.println(obj2.getScoreSize());*/
	    
	    assertEquals (3, obj1.getScoreSize());
	    assertEquals (5, obj2.getScoreSize());
	    
	    /*System.out.println(obj1.toString());
		System.out.println(obj2.toString());*/
	    
	    
	    
	}
	@Test
	public void testSum() {
		/*System.out.println("sum");
		System.out.println(obj1.sum());
		System.out.println(obj2.sum());*/
		
		
		assertEquals (216.0, obj1.sum(), 0.0001);
		assertEquals (388.0, obj2.sum(), 0.0001);
		
	}

	@Test
	public void testMinimum() {
		
		/*System.out.println("minimum");
		System.out.println(obj1.minimum());
		System.out.println(obj2.minimum());*/
		
		assertEquals (20.5, obj1.minimum() , 0.001);
		assertEquals (30.5, obj2.minimum() , 0.001);
	}

	@Test
	public void testFinalScore() {
		
		/*System.out.println("finalscore");
		System.out.println(obj1.finalScore());
		System.out.println(obj2.finalScore());*/
		
		assertEquals (195.5, obj1.finalScore(), 0.001);
		assertEquals (357.5, obj2.finalScore(), 0.001);
		
	}

	
}
