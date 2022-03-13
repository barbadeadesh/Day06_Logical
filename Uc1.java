package com.bridgelab.logicalDay6;

import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the no A");
		int a =sc.nextInt();
		System.out.println("Enter the no B");
		int b =sc.nextInt();
		int c;
		 
		for(int i=1; i<=10; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		
	}

}