package com.company;

import java.util.Scanner;

public class Activity2{
	
	public static void main (String[] args){
		Scanner num= new Scanner(System.in);		
		
		System.out.print("Enter first number: "); 
		int num1 = num.nextInt();
		
		System.out.print("Enter second number: "); 
		int num2 = num.nextInt();
		
		int sum = num1+num2;
		int diff = num1-num2;
		int prod = num1*num2;
		int quot = num1/num2;
		int rem = num1%num2;
		
		System.out.println("THE SUM IS " + sum);
		System.out.println("THE DIFFERENCE IS " + diff );
		System.out.println("THE PRODUCT IS " + prod);
		System.out.println("THE QUOTIENT IS " +quot );
		System.out.println("THE REMAINDER IS " +rem );
	}
}
	