package com.interview;

public class FibanaciSeries {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int sum=0;
	
		System.out.println(n1 +" " +n2);
		
		for(int i=2;i<10;i++) {
			
			sum=n1+n2; // 0+1///// n1 1+n2 1=2
			System.out.println("  "+sum); //1  ,,,, sum=n2    
			n1=n2;//// 1
			n2=sum;///sum 1 = n2 1

		}
		
		
	}

}
