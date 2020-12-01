package com.company;

import java.util.Scanner;

public class Activity2 {
    public Activity2() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Please Enter The First Number: ");
        int var2 = var1.nextInt();
        System.out.println("Please Enter The Second Number: ");
        int var3 = var1.nextInt();
        int var4 = var2 + var3;
        int var5 = var2 * var3;
        int var6 = var2 - var3;
        int var7 = var2 / var3;
        int var8 = var2 % var3;
        System.out.println("The Sum of two number is: " + var4 + "\nThe Product of two number is: " + var5 + "\nThe Difference of two number is: " + var6 + "\nThe Quotient of two number is: " + var7 + "\nThe Remainder of two number is: " + var8);
    }
}
