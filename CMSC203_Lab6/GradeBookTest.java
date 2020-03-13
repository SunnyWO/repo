import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook obj1;
	GradeBook obj2;

	@BeforeEach
	void setUp() throws Exception {
		obj1 = new GradeBook(5);
		obj1.addScore(25);
		obj1.addScore(35);
		obj2 = new GradeBook(5);
	}

	@AfterEach
	void tearDown() throws Exception {
		obj1 = null;
		obj2 = null;
	}

	@Test
	void testAddScore() {
		//tests addScore() for a GradeBook object with 2 elements
		assertTrue(obj1.toString().equals("25.0 35.0 "));
		assertEquals(obj1.getScoreSize(),2);
		//tests addScore() for a GradeBook object with no elements
		assertTrue(obj2.toString().equals(""));
		assertEquals(obj2.getScoreSize(),0);
	}

	@Test
	void testSum() {
		//tests sum() for a GradeBook object with 2 elements
		assertEquals(obj1.sum(),60.0);
		//tests sum() for a GradeBook object with no elements
		assertEquals(obj2.sum(),0.0);
	}

	@Test
	void testMinimum() {
		//tests minimum() for a GradeBook object with 2 elements
		assertEquals(25.0, obj1.minimum(), .001);
		//tests minimum() for a GradeBook object with no elements
		assertEquals(0.0, obj2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		//tests finalScore() for a GradeBook object with 2 elements
		assertEquals(35.0, obj1.finalScore(), .001);
		//tests finalScore() for a GradeBook object with no elements
		assertEquals(0.0, obj2.finalScore(), .001);
	}

}
