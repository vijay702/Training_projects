package com.interview;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		
		
		String arr[]= {"vijay","karal","saritha","vijayy","sarithaa"};
		Boolean flag=false;
		
		for(int i=0;i<arr.length;i++) {
			
			
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					
					System.out.println("Duplicate element is " +arr[i]);
					flag=true;
				}
				

			}
		}
			
			
			if(flag==false) {
				System.out.println("no duplicate elements ");
			}

	}

}
