package com.company;
import java.util.Scanner;

public class ArrayMaxMin{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[];
		array = new int[10];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter element "+(i+1)+ ": " );
			array[i] = input.nextInt();

		}
		System.out.print("Elements: ");
		for (int i = 0; i <array.length; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println();
		int maxVal = array[0];
		int minVal = array[0];
	
		for(int i=0; i<array.length; i++){
			if (array[i]>maxVal){
				maxVal= array[i];
				
			}
			if (array[i] < minVal){
				minVal= array[i];
				
			}
		}
			System.out.println("The maximum value is " + maxVal);
			System.out.println("The minimum value is " + minVal);

	}
}