package com.interview;

import java.util.Arrays;

public class ArrayEqualornot {

	public static void main(String[] args) {
	
		
		int a[] = {1,2,3,4,5};
		int a1[] = {1,2,3,4,5};
		
		
	Boolean status =Arrays.equals(a,a1);
	
			if(status==true) {
				
				System.out.println("both arrays are equal");
			}else {
				System.out.println("not equal");
			}
		
		

	}

}
