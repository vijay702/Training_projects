package com.interview;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first Number :");
		int a = sc.nextInt();
		
		System.out.println("Enter a Second Number :");
		int b = sc.nextInt();
		
		System.out.println("Enter a third Number :");
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is the largest number ");
		}
		
		else if(b<a && b<c) {
			
			System.out.println("b is the largest number ");
		}else if (c>a && c>b) {
			
			System.out.println("c is the largest number ");
		}else {
			
			System.out.println(" all numbers are same ");
		}
		
		

	}

}
