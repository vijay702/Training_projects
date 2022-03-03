package com.interview;

public class ClassicTwoSumProblem {

	public static void main(String[] args) {
	
		int num =121;
		
		int rev =0;
		
		int org_num=num;
		
		
		while(num!=0) {
			
			rev=rev*10+num%10;// rev=4 ,,,,
			num=num/10 ; /// 123,,,,,,
			
			
		}
		System.out.println(rev);
		
		
		if(org_num==rev) {
			
			System.out.println("given no is a palindrome");
		}else {
			
			System.out.println("the given no is not a palindrome ");
		}
		
		
		
		
		
		
		
		
	}
}
