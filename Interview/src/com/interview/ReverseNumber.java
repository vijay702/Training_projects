package com.interview;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		
		int num = sc.nextInt();//1234
	int	org_num=num;
		
		int rev=0;
		
		while(num!=0) {
			
			
			rev=rev*10 + num%10;/// 0*10+1234%10=4 ,4*10+123%10=40+3=43; 
			num=num/10;//1234/10 = 123,    123/10=12/
			
		}
		
		System.out.println("Reverse Numner is "+rev);
		
		if(org_num==rev) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("number is a not palindrome");
		}
		

	}

}
