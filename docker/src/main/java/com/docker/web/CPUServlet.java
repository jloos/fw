package com.docker.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.docker.CPUThread;
import com.docker.MemoryThread;

public class CPUServlet extends HttpServlet {
	
	public void init() throws ServletException {  
        System.out.println("init cpu ... ");  

//        int it = 5;
//		CPUThread cpuTestThread = new CPUThread();  
//        for (int i = 0; i < it; i++) {  
//            Thread cpuTest = new Thread(cpuTestThread);  
//            cpuTest.start();  
//        } 
    }  

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		System.out.print("Test Get... ");
		String load = req.getParameter("load");
		System.out.print("load = "+ load);
		int it = 5;
		if(load != null)		
			it = Integer.parseInt(load);
		CPUThread cpuTestThread = new CPUThread();  
        for (int i = 0; i < it; i++) {  
            Thread cpuTest = new Thread(cpuTestThread);  
            cpuTest.start();  
        } 
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		System.out.print("Test Post ... ");
	}
}
