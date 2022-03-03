package com.interview;

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[] = {10,20,40,50,30};
		boolean flag =false;
		
		int searchElemennt=10;
		
		for(int i=0; i<a.length;i++) {
			
			if(a[i]==searchElemennt) {
				
				System.out.println("element found index is" +i);
				flag=true;
				break;
			}
			
			
		}

		if(flag==false) {
			
			System.out.println("elemnent is not  found");
		}
		
		
		
	}

}
