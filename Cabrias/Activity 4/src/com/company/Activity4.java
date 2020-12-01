package com.company;
import java.util.Scanner;

    public class Activity4{


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Options \n1. C->F\n2. F->C\nEnter choice: ");
            int temp = in.nextInt();

            double cel, far, val;

            switch (temp) {
                case 1 -> {
                    System.out.println("Enter Celsius Value: ");
                    cel = in.nextDouble();
                    val = ((cel * 9) / 5) + 32;
                    System.out.println(+cel+ " degrees in Celsius " + " =  " +val+ " degrees in Fahrenheit ");
                }
                case 2 -> {
                    System.out.println("Enter Fahrenheit Value: ");
                    far = in.nextDouble();
                    val = ((far - 32) * 5) / 9;
                    System.out.println(+far+ " degrees Fahrenheit " + " =  " +val+ " degrees in Celsius ");
                }
                default -> System.out.println("Invalid");
            }

    }
}
