package com.interview;

public class Numberofdigitsinnumberr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer num = 3455345;
		
		int count=0;
		
		while(num>0) {
			
			
			num=num/10;
			count++;
			
		}
		System.out.println("number count is "  +count);

	}

}
