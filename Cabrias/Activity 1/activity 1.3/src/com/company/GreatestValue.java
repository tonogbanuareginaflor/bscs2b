package com.company;

public class GreatestValue {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 23;
        int num3 = 5;
        int greatval = Math.max((num1 > num2 ? num1 : num2), num3);

        System.out.println("The Value of 1st number is: " +num1+
                "\nThe Value of 2nd number is: " +num2+
                "\nThe Value of 3rd number is: " +num3+
                "\nTYhe Greatest Value of the 3 Numbers is: " +greatval);
    }
}