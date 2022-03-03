package com.interview;

import java.util.Scanner;

public class ReversenumStringBuffer {

	public static void main(String[] args) {
		
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int num = sc.nextInt();//1234
		int orgNum=num;
		
		StringBuffer rev;
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		rev = sb.reverse();
		System.out.println("Reverse Number Is"+rev);
		
		

	}

}
