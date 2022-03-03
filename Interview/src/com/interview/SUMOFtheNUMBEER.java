package com.interview;

public class SUMOFtheNUMBEER {

	public static void main(String[] args) {
		//count sum of digits
		
		int num =98978766; // input 
		
		int sum =0; //storing variable 
		
		while(num>0) {
			
			sum=sum+num%10;
			
			num=num/10;
		}
		System.out.println("sum of the digit is "  +sum);

	}

}
