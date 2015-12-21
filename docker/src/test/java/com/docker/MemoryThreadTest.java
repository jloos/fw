package com.docker;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MemoryThreadTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRun() {
//		fail("Not yet implemented");
		MemoryThread memTest = new MemoryThread();
		for (int i = 0; i < 6; i++) {
			new Thread(memTest).start();
		}
		
		System.out.println(Memory.getInstance().size());
	}

}
