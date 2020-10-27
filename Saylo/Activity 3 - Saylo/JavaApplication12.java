
package javaapplication12;

import javax.swing.JOptionPane;
public class JavaApplication12 {


    public static void main(String[] args) {
        String word1 = JOptionPane.showInputDialog("Enter temperature value in Celsius");
        double value = Double.parseDouble(word1);
        double fahrenheit = (value*1.8)+32;
        
        JOptionPane.showMessageDialog(null, "Temperature value in Fahrenheit: " + fahrenheit);

    }
    
}
