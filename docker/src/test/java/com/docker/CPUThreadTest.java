package com.docker;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CPUThreadTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRun() {
		CPUThread cpuTestThread = new CPUThread();  
        for (int i = 0; i < 80; i++) {  
            Thread cpuTest = new Thread(cpuTestThread);  
            cpuTest.start();  
        }  
          
        //Windows Task Manager shows  
        try {  
            Runtime.getRuntime().exec("taskmgr");  
        } catch (IOException e1) {  
            e1.printStackTrace();  
        }  
//		fail("Not yet implemented");
	}

}
