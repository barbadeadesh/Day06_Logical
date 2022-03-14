package com.bridgelab.logicalDay6;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		 
		int i, Number, Sum = 0 ;
		 Scanner sc = new Scanner(System.in);		
		System.out.println( "Please Enter any Number ");
		  Number = sc.nextInt();

		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			System.out.println(" It is a Perfect Number");
		}
		else {
			System.out.println("It is NOT a Perfect Number");
		}
	}

}
