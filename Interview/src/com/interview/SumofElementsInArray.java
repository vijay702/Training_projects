package com.interview;

public class SumofElementsInArray {

	public static void main(String[] args) {
		
		
		int a[] = {1,4,5,6,8};
     	int	sum=0;
		int lenght =a.length;
		
	/*	for(int i=0;i<=lenght-1;i++) {
			
			sum=sum+a[i];
			
		}*/
		
		
		for(int value :a)
		{
			sum=sum+value;
			
			
		}
		
       System.out.println("sum of the array"+sum);		

	}

}
