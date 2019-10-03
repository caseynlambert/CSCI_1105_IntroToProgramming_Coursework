package chapter42;

import static org.junit.Assert.*;

import org.junit.Test;

public class Chapter6_3Test {

	@Test
	public void testreverse() {
		assertEquals(Chapter6_3.reverse(242), 242);
		assertEquals(Chapter6_3.reverse(101), 101);
		assertEquals(Chapter6_3.reverse(21012), 21012);
		assertEquals(Chapter6_3.reverse(5896985), 5896985);
		assertEquals(Chapter6_3.reverse(1), 1);
	}

	@Test
	public void testisPalindrome() {
		assertTrue(Chapter6_3.isPalindrome(242));
		assertTrue(Chapter6_3.isPalindrome(2112));
		assertFalse(Chapter6_3.isPalindrome(2115));
		assertFalse(Chapter6_3.isPalindrome(46));

	}
}
