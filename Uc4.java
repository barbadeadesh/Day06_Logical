package com.bridgelab.logicalDay6;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int a;
		int res=0;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Postive or Negative  number");
		n=sc.nextInt();
		while(n!=0)
		{
		a=n%10;
		res=(res*10)+a;
		n=n/10;
		}
		System.out.println("reverse  number is "+res);
		
	}

}
