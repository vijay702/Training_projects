package com.interview;

public class ArrayEqualsLogic {

	public static void main(String[] args) {
		
		int a1[]= {1,2,3,4,5,6};
		int a2[]= {1,2,3,4,5};
		
		Boolean status=true;	
		
		if(a1.length==a2.length) {
			
			
			for(int i=0;i<a1.length;i++) {
				
				if(a1[i] != a2[i]);{
					
					status=false;
				}
			}	
			
		}else {
			
			status=false;
		}
		
		if(status==true) {
			
			System.out.println("the given array is equal");
			
			
		}else {
			
			System.out.println("not equal");
		}
		
		

	}

}
