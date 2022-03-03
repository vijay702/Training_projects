package com.interview;

public class fibo {

	public static void main(String[] args) {
		
		int n1=0;  /// 0 1 1 2 3 5  8  13
		int n2=1;
		
	int sum =0;
   System.out.println(n1+"   " +n2);
	
	for(int i=0;i<=10;i++) {
		
		
		sum = n1+n2;//0+1=1
		
		System.out.println(sum);///1
		
		n1 =n2;//////n1 =1;
		
		n2=sum;/////n=1
		
		
		
	}
		
		
		
	}

}
