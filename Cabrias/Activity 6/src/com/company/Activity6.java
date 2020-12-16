package com.company;

import java.util.Scanner;

public class Activity6 {
    public static int max(int[] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
    public static int min(int[] array) {
        int min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;

        array = new int[10];

        for (int i=0; i<array.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = input.nextInt();

        }
        input.close();
        System.out.println("Maximum value of an array is " + max(array));
        System.out.println("Minimum value of an array is " + min(array));
    }
}