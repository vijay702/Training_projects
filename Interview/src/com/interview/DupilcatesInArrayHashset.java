package com.interview;

import java.util.HashSet;

public class DupilcatesInArrayHashset {

	public static void main(String[] args) {
		
		
		String arr[]= {"vijay","karal","saritha","vijay","saritha"};
		
		HashSet<String> hs = new HashSet();
		
		for(String names:arr) {
			
			
			
			if(hs.add(names)==false) {
				
				System.out.println("duplicate element found "+names);
			}
			
		}

	}

}
