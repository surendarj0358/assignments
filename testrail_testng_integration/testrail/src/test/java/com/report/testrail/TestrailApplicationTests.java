package com.report.testrail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(TestRailIdProvider.class)
class TestrailApplicationTests {

	@Test
	@TestRail(id="12")
	public void testAssertTrue(){
		assertTrue(true);
	}

	@Test
	@TestRail(id="13")
	public void testAssertFalse(){
		assertFalse(false);
	}

	@Test
	@TestRail(id="14")
	public void testAssertTrueTwo(){
		assertTrue(true);
	}
}
