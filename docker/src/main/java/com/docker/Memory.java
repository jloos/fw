package com.docker;

import java.util.ArrayList;
import java.util.List;

public class Memory {
	
	private volatile static String str;
	private volatile static List instance;
	

	private Memory (){}

	
	public static String getStr() {
		if (str == null) {
			synchronized (Memory.class) {
				if (str == null) {
					String temp = "[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-digest/1.0/plexus-digest-1.0.pom (2 KB at 1.7 KB/sec)";
					for (int i = 0; i < 16; i++) {  
						str = str + temp; 
			        }
				}
			}
		}
		return str;
	}
	public static List getInstance() {
		if (instance == null) {
			synchronized (Memory.class) {
				if (instance == null) {
					instance = new ArrayList();
				}
			}
		}
		return instance;
	}
}
