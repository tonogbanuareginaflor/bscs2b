package com.company;

import java.util.Scanner;

public class Activity3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the temperature value in celsius: ");
        double cel = in.nextDouble();

        double far = ((cel*9)/5)+32;

        System.out.println("The temperature value converted in fahrenheit is " +far);

    }
}
