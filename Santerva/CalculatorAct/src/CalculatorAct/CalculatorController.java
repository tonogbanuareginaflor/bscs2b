
package CalculatorAct;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    CalculatorView calView;
    
    CalculatorController(CalculatorView calView) {
        this.calView = calView;
        calView.allListeners(new ActionButton());
    }
    
    class ActionButton implements ActionListener {

        
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == calView.addButton) {
                int num = Integer.parseInt(calView.num1tf.getText());
                int num1 = Integer.parseInt(calView.num2tf.getText());
                int result = CalculatorModel.add(num, num1);
                calView.resultBox.setText("" + result);
            }
            if(e.getSource() == calView.minusButton) {
                int num1 = Integer.parseInt(calView.num1tf.getText());
                int num2 = Integer.parseInt(calView.num2tf.getText());
                int result = CalculatorModel.subtract(num1, num2);
                calView.resultBox.setText("" + result);
            }
            if(e.getSource() == calView.multiplyButton) {
                int num1 = Integer.parseInt(calView.num1tf.getText());
                int num2 = Integer.parseInt(calView.num2tf.getText());
                int result = CalculatorModel.multiply(num1, num2);
                calView.resultBox.setText("" + result);
            }
            if(e.getSource() == calView.divideButton) {
                int num1 = Integer.parseInt(calView.num1tf.getText());
                int num2 = Integer.parseInt(calView.num2tf.getText());
                int result = CalculatorModel.divide(num1, num2);
                calView.resultBox.setText("" + result);
            }
            if(e.getSource() == calView.modulusButton) {
                int num1 = Integer.parseInt(calView.num1tf.getText());
                int num2 = Integer.parseInt(calView.num2tf.getText());
                int result = CalculatorModel.modulus(num1, num2);
                calView.resultBox.setText("" + result);
            }
            if(e.getSource() == calView.clearButton) {
                calView.num1tf.setText("");
                calView.num2tf.setText("");
                calView.resultBox.setText("");
            }
        }
        
    }
}
