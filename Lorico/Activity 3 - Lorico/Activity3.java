package com.company;

import java.util.Scanner;

public class Activity3{
	
	public static void main (String[] args){
		Scanner temp= new Scanner(System.in);		
		
		System.out.print("Enter temperature in Celsius: "); 
		double cel = temp.nextDouble();
		
		double fahr = (cel*9/5) + 32;
		
		System.out.println(cel + " degree Celsius" + " = " + fahr + " degree Fahrenheit");
	}
}
	