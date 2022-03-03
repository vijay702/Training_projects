package com.interview;

public class ReverseString {
	public static void main(String[] args) {
		
	//1 using string concatenation operator
		
		String str="abcde";
		
		String rev="";
		
		int len = str.length();
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
		}
		
		System.out.println("reverse string is"+rev);
		
		if(str.equals(rev)) {
			System.out.println("given string is palindrome");
		}else {
			System.out.println("given string is not a polindrome");
		}
	
		StringBuffer sb = new StringBuffer(str);
		
		StringBuffer rev1=sb.reverse();
		System.out.println("String Buffer Reverse"+rev1);
	
		
	}
}
