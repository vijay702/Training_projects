package com.interview;

import java.util.Scanner;

public class SwappingTwoNum {

	public static void main(String[] args) {
		
		int a ;
		
		int b ;
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("enter a");
		System.out.println("enter b");
		
		a = in.nextInt();
		b=in.nextInt();
		in.close();
		System.out.println("befor swapping "+a +b);
		
//logic 1 
		
//		int t=a;
//		System.out.println("t value"+t);
//		a=b;
//		b=t;
		
		//logic2
//		a=a+b; //75
//		b=a-b; //25
//		a=a-b; //50
		
		
		//logic3
		// a and b  values should not be zero
		 
		//logic3
		try {
		a= a*b; //1250
		System.out.println(a);
		b=a/b;
		System.out.println(b);
		a=a/b;
		System.out.println(a);
		
		System.out.println("after  swapping "+a +b);
		}catch (Exception e) {
			
			System.out.println("enter value greater than zero");
			
		}

	}

}
