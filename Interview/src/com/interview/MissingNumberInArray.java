package com.interview;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
	//array should not have a duplicate value
	//must be follow range 
		
		int a[]= {1,2,4,5};
		
		//1+2+4+5=12;
		//sum 2 = 1+2+3+4+5=15
		//sum2-sum1= missing element 
		int missingNumber=0;
		
		int sum1=0;
		
		for(int  i=0;i<a.length;i++) {
			
			sum1 =sum1+a[i];
		}
		System.out.println("sum of elements in array" +sum1);
		
		
		int sum2=0;
		
		for(int i=1;i<=5;i++) {
			
			sum2 = sum2+i;
			
		}
		System.out.println("sum of elements between range " +sum2);
		
		missingNumber =sum2-sum1;
		System.out.println("missing number in array is     "  +  missingNumber);

	}

}
