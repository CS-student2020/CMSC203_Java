import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

	private GradeBook g1, g2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		// Create an object of GradeBook to hold 5 scores
		g1 = new GradeBook(5);
		
		// Add some random scores to the GradBook object
		g1.addScore(10);
		g1.addScore(15);
		g1.addScore(13.5);
		
		// Create an object of GradeBook to hold 5 scores
		g2 = new GradeBook(5);
		
		// Add some random scores to the GradBook object
		g2.addScore(7);
		g2.addScore(14.5);
		g2.addScore(19);
		g2.addScore(20);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		// Set two objects of GradeBook to null
		g1 = g2 = null;
	}

	@Test
	void testAddScore() 
	{
		
		/* 
		 * Use the toString method to compare the contents of 
		 * what is in the scores array vs. what is expected to be
		 * in the scores array assertTrue 
		 */
		assertTrue(g1.toString().equals("10.0 15.0 13.5 "));
		assertTrue(g2.toString().equals("7.0 14.5 19.0 20.0 "));
		
		/*
		 * Compare the scoreSize to the expected number of scores entered,
		 * using assertEquals
		 */
		assertEquals(g1.getScoreSize(), 3);
		assertEquals(g2.getScoreSize(), 4);
	}

	@Test
	void testSum() {
		
		// Compare what is returned by sum() to the expected sum of the scores entered
		assertEquals(g1.sum(), 38.5, 0.0001);
		assertEquals(g2.sum(), 60.5, 0.0001);
	}

	@Test
	void testMinimum() {
		
		// Compare what is returned by minimum() to the expected minimum of the scores entered
		assertEquals(g1.minimum(), 10, 0.001);
		assertEquals(g2.minimum(), 7, 0.001);
	}

	@Test
	void testFinalScore() {
		
		/* 
		 * Compare what is returned by finalScore() to the expected 
		 * finalScore of the scores entered. The finalScore is the sum of the scores,
		 * with the lowest score dropped if there are at least two scores,
		 * or 0 if there are no scores. 
		 */
		assertEquals(g1.finalScore(), 28.5, 0.001);
		assertEquals(g2.finalScore(), 53.5, 0.001);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(g1.getScoreSize(), 3);
		assertEquals(g2.getScoreSize(), 4);
	}

	@Test
	void testToString() {
		assertTrue(g1.toString().equals("10.0 15.0 13.5 "));
		assertTrue(g2.toString().equals("7.0 14.5 19.0 20.0 "));
	}

}
