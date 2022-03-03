package com.interview;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {
		
	//factorial number 5=1*2*3*4*5=?
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number ");
		int num =sc.nextInt();
		
		int factorial =1;
		
		
		for(int i=1;i<=num;i++) {
			
			
			factorial =factorial*i;
		}
		System.out.println(factorial);
		
	}

}
