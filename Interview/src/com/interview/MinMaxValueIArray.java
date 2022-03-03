package com.interview;

public class MinMaxValueIArray {

	public static void main(String[] args) {


		int a[] = {50,30,40,20,60};
	
		
		int max = Integer.MIN_VALUE;
		
		int min = Integer.MAX_VALUE;
		
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max)
				max=a[i];//50//60

		}
		System.out.println(max);
		
		
	for(int i=0;i<a.length;i++) {
			
			if(a[i]<min)
				min=a[i];

		}

	
	System.out.println(min);
	}

}
