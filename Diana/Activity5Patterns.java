/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;


public class Activity5Patterns {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("I.");
        int ht = 4, wt = 10; 
        for (int i = 1; i <= ht; ++i){
        for (int j = 1; j <= wt; ++j){
            System.out.print("* ");
         }
            System.out.println();
        }
  
        
        System.out.println("II.");
        int rows = 5;
        for (int i = 1; i <= rows; ++i){
        for (int j = 1; j <= i; ++j){    
            System.out.print("*");
                }
            System.out.println();
            }
        
        
        System.out.println("III.");
        int rowss = 5;
        for (int i = 1; i<=rowss; i++){
        for(int j = rowss; j>=1; j--){
                if (j > i)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        System.out.println("IV.");
        int od = 1;
        int space = 4;
        for (int i = 1; i<6; i++){
            for (int j = space; j>=1; j--){
                System.out.print("  ");
            }
            for (int j = 1; j<=od; j++){
                System.out.print("* ");
            }
            System.out.println();
            space = space -1;
            od = od+2;
        }
        
        
        System.out.println("V.");
        int od2 = 1;
        int space2 = 4;
        for (int i = 1; i<6; i++){
            for (int j = space2; j>=1; j--){
                System.out.print("  ");
            }
            for (int j = 1; j<=od2; j++){
                System.out.print(i+" ");
            }
            System.out.println();
            space2 = space2 -1;
            od2 = od2+2;
        }
        

        System.out.println("VI.");
        int space3 = 4;
        for (int i = 1; i<6; i++){
        int kk
        for (int j = space3; j>=1; j--){
        System.out.print("  ");
            } 
        for (kk = i; kk != 0; kk--){
        System.out.print(kk+" ");
            }
        space3--;
        for (int l = 2; l <= i; l++){
        System.out.print(l+" ");
            }
        System.out.println();
            }
        }
    }
