/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity4;

import java.util.Scanner;

/**
 *
 * @author Regina Flor
 */
public class Activity4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner temperature = new Scanner(System.in);

			System.out.println(("Options: ") + (" \n 1. C - F") + ("\n 2. F - C "));

			System.out.print("Enter choice: ");
			int choice = temperature.nextInt();

			if (choice == 1) {

				System.out.print("Enter choice: ");
				int temp = temperature.nextInt();
				double fahr = (temp * 9) / 5 + 32;
				System.out.println(temp + " degrees Celcius = " + fahr + " degrees Farenheit ");

			} else if (choice == 2) {

				System.out.print("Enter choice: ");
				int temp = temperature.nextInt();
				double cels = (temp - 32) * 5 / 9;
				System.out.println(temp + " degrees Celcius = " + cels + " degrees Farenheit ");
			}
		}
    }
    

