/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity1.pkg3;

/**
 *
 * @author Regina Flor
 */
public class Activity13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 10, num2 = 23, num3 = 5;
        int highestNum = (num1 > num2 ? num1 : num2) > num3 ? 
                        (num1 > num2 ? num1 : num2) : num3;	

        System.out.println
        ("number 1 = " + num1 +
         "\nnumber 2 = " + num2 +
         "\nnumber 3 = " + num3 +
         "\nThe highest number is = " + highestNum);
    }
}
        // TODO code application logic here

    
