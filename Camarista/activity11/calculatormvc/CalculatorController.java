package calculatormvc;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    CalculatorView calView;

    CalculatorController(CalculatorView calView) {
        this.calView = calView;
        calView.allListeners(new ActionButton());
    }

    class ActionButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == calView.addButton) {
                int num1 = Integer.parseInt(calView.inputnum1.getText());
                int num2 = Integer.parseInt(calView.inputnum2.getText());
                int result = CalculatorModel.add(num1, num2);
                calView.boxResult.setText("" + result);
            }
            if(e.getSource() == calView.minusButton) {
                int num1 = Integer.parseInt(calView.inputnum1.getText());
                int num2 = Integer.parseInt(calView.inputnum2.getText());
                int result = CalculatorModel.subtract(num1, num2);
                calView.boxResult.setText("" + result);
            }
            if(e.getSource() == calView.multiplyButton) {
                int num1 = Integer.parseInt(calView.inputnum1.getText());
                int num2 = Integer.parseInt(calView.inputnum2.getText());
                int result = CalculatorModel.multiply(num1, num2);
                calView.boxResult.setText("" + result);
            }
            if(e.getSource() == calView.divideButton) {
                int num1 = Integer.parseInt(calView.inputnum1.getText());
                int num2 = Integer.parseInt(calView.inputnum2.getText());
                int result = CalculatorModel.divide(num1, num2);
                calView.boxResult.setText("" + result);
            }
            if(e.getSource() == calView.modulusButton) {
                int num1 = Integer.parseInt(calView.inputnum1.getText());
                int num2 = Integer.parseInt(calView.inputnum2.getText());
                int result = CalculatorModel.modulus(num1, num2);
                calView.boxResult.setText("" + result);
            }
            if(e.getSource() == calView.clearButton) {
                calView.inputnum1.setText("");
                calView.inputnum2.setText("");
                calView.boxResult.setText("");
            }
        }

    }
}