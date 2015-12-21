package com.docker;

import java.util.ArrayList;
import java.util.List;

public class MemoryThread implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		String str = null;
		String temp = Memory.getStr();
		for (int i = 0; i < 16; i++) {  
			str = str + temp; 
        } 
		List data = new ArrayList();
		for (int i = 0; i < 9999; i++) {  
			Memory.getInstance().add(str); 
        }  
		
//		Memory.getInstance().addAll(data);
		System.out.println(Memory.getInstance().size());
	}
}
