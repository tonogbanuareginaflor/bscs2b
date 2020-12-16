package com.company;

public class Activity5{

    public static void main(String[] args) {

        System.out.println("i)");
        for (int i=0; i<=3; ++i) {
            for (int j=0; j<=9; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("ii)");
        for (int i=0; i<=4; ++i) {
            System.out.print("  ");
            for (int j=0; j<=i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("iii)");
        int star = 5;

        for(int i=0; i<5; i++) {


            for(int j=0; j<5 - i; j++) {
                System.out.print("  ");
            }

            for (int k=0; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("iv)");
        star = 5;

        for(int i=0; i<=5; i++) {


            for(int j=0; j<=5 - i; j++) {
                System.out.print("  ");
            }

            for (int k=0; k<(i * 2 - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("v)");
        for (int i = 1; i <= 5; i++) {

            for (int j=1; j<=5 - i; j++) {
                System.out.print("  ");

            }
            for (int k=1; k<=(2 * i) - 1; k++) {
                System.out.print(" " + i);

            }
            System.out.println();
        }


        System.out.println("vi)");
        int space = 5;
        for (int i=0; i<=5; i++) {
            int k = 0;
            for (int j=space; j>=1; j--) {
                System.out.print("  ");
            }
            for (k=i; k!=0; k--) {
                System.out.print(k + " ");
            }
            space--;
            for (int l=2; l<=i; l++) {
                System.out.print(l + " ");
            }

            System.out.println();

        }
    }
}
