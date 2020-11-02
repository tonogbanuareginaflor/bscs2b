
package activity.pkg4;

import javax.swing.JOptionPane;
public class Activity4 {


    public static void main(String[] args) {
        int value = Integer.parseInt(JOptionPane.showInputDialog("Enter Value: " + " \n Options:"
        +"\n 1. Celsius to Fahrenheit: "+"\n 2. Fahrenheit to Celsius"));
        switch(value){
            case 1: 
                double cel = Double.parseDouble(JOptionPane.showInputDialog("Enter Value: "));
                double fahr = (cel*1.8)+32;
                
                JOptionPane.showMessageDialog(null, "Temperature value in Fahrenheit: " + fahr);
                break;
            case 2:
                double fahr1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Value: "));
                double cel1 = (fahr1-32)*(0.55555555555);
                
                JOptionPane.showMessageDialog(null, "Temperature value in Fahrenheit: " + cel1);
                break;
        }
    }
    
}
