package chapter1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HanoiTowersTest {

	private HanoiTowers subject;
	
	@Before
	public void setup() {
		subject = new HanoiTowers();
	}
	
	
	@Test
	public void getNumberOfMovements() {
		assertEquals(0, subject.getNumberOfMovements(0));
		assertEquals(1, subject.getNumberOfMovements(1));
		assertEquals(3, subject.getNumberOfMovements(2));
		assertEquals(7, subject.getNumberOfMovements(3));
		assertEquals(15, subject.getNumberOfMovements(4));
		assertEquals(31, subject.getNumberOfMovements(5));
		assertEquals(63, subject.getNumberOfMovements(6));
		assertEquals(255, subject.getNumberOfMovements(8));
	}

}
