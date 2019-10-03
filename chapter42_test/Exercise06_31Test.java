package chapter42;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise06_31Test extends Exercise06_31 {

	@Test
	public void testisValid() {
		//Visa card
		assertTrue(Exercise06_31.isValid(4117174154677830L));
		//American Express card
		assertTrue(Exercise06_31.isValid(377133980645968L));
		//Master card
		assertTrue(Exercise06_31.isValid(5322811259306132L));
		//Discover card
		assertTrue(Exercise06_31.isValid(6011298005847136L));
		//False if under 13 digits long
		assertFalse(Exercise06_31.isValid(411717415467L));
		//False if over 16 digits long
		assertFalse(Exercise06_31.isValid(41171741546778301L));
		//False card number
		assertFalse(Exercise06_31.isValid(6012278005847136L));
	}
	
	@Test
	public void testsumOfDoulbeEvenPlace() {
		assertEquals(Exercise06_31.sumOfDoubleEvenPlace(4117174154677830L), 35);
		assertEquals(Exercise06_31.sumOfDoubleEvenPlace(377133980645968L), 27);

	}
	
	@Test
	public void testgetDigit() {
		assertEquals(Exercise06_31.getDigit(35), 8);
		assertEquals(Exercise06_31.getDigit(30), 3);
		assertEquals(Exercise06_31.getDigit(27), 9);
	}
	
	@Test
	public void testsumOfOddPlace() {
		assertEquals(Exercise06_31.sumOfOddPlace(4117174154677830L), 35);
		assertEquals(Exercise06_31.sumOfOddPlace(377133980645968L), 43);
	}
	
	@Test
	public void testprefixMatched() {
		assertTrue(Exercise06_31.prefixMatched(4117174154677830L, 4));
		assertTrue(Exercise06_31.prefixMatched(377133980645968L, 37));
		assertTrue(Exercise06_31.prefixMatched(5322811259306132L, 5));
		assertTrue(Exercise06_31.prefixMatched(6011298005847136L, 6));
		assertFalse(Exercise06_31.prefixMatched(8117174114677830L, 4));
		assertFalse(Exercise06_31.prefixMatched(9322411259306132L, 5));
		
	}
	
	@Test
	public void testgetSize() {
		assertEquals(Exercise06_31.getSize(4117174154677830L), 16);
		assertEquals(Exercise06_31.getSize(377133980645968L), 15);
		assertEquals(Exercise06_31.getSize(5322811259306132L), 16);
		assertEquals(Exercise06_31.getSize(411717415467L), 12);
		assertEquals(Exercise06_31.getSize(41171741546778301L), 17);
	}
	@Test
	public void testgetPrefix() {
		assertEquals(Exercise06_31.getPrefix(4117174154677830L, 1), 4);
		assertEquals(Exercise06_31.getPrefix(377133980645968L, 2), 37);
		assertEquals(Exercise06_31.getPrefix(5322811259306132L, 1), 5);

	}
}
