package com.company;

import java.util.Scanner;
//import java.util.ArrayList; //new

public class Activity7 {

        public static int min(int[] array) {
            int min = 0;

            for(int i=0; i<array.length; i++) {
                if(array[i]<min) {
                    min = array[i];
                }
            }
            return min;
        }
        public static int max(int[] array) {
             int max = 0;

            for(int i=0; i<array.length; i++) {
            if(array[i]>max) {
                max = array[i];
                 }
            }
         return max;
         }

    public static void main(String[] arg) {
        //ArrayList<String> array = new ArrayList<String>(); //new
        //array.add(" ");//new

        Scanner in = new Scanner(System.in);
        int[] array;
        array = new int[0];

        System.out.print("Enter the size of array: ");
        int z = in.nextInt();
        int y[] = new int[z];
        System.out.println("Enter numbers: ");
        for (int i=0; i<z; i++) {
            y[i] = in.nextInt();
        }

        in.close();
        System.out.print("Smallest element: " + min(array));
        System.out.println(" Largest element: " + max(array));
        }
    }

