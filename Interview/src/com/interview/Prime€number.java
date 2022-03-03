package com.interview;

import java.util.Scanner;

public class Prime€number {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter a number ");
	
   int num = sc.nextInt();
	
		int count=0;
		
		
		if(num>1) {
			
			for(int i=1;i<=num;i++) {
				
				
				if(num%i==0)
				count++;
				
			}
			
			if(count==2) {
				System.out.println("given number is a prime number ");
			}else {
				System.out.println("given no is not a palindrome nnumber");
			}
			
			
			
		}else {
			
			
			System.out.println("given no is a not a prime number ");
		}
		
		
		
		

	}

}
