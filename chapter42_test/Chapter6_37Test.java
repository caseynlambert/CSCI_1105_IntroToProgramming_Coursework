package chapter42;

import static org.junit.Assert.*;

import org.junit.Test;

public class Chapter6_37Test {

	@Test
	public void testformat() {
		assertEquals(Chapter6_37.format(3, 0), "3");
		assertEquals(Chapter6_37.format(45, 2), "45");
		assertEquals(Chapter6_37.format(456, 6), "000456");
		assertEquals(Chapter6_37.format(12, 7), "0000012");
		assertEquals(Chapter6_37.format(4789, 12), "000000004789");

	}

}
