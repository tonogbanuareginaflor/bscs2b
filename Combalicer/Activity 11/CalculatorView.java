
package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView { 
        JButton addButton;
        JButton minusButton;
        JButton multiplyButton;
        JButton divideButton;
        JButton modulusButton;
        JButton clearButton;
        JTextField num1tf;
        JTextField num2tf;
        JLabel result;
        JLabel firstNum;
        JLabel secondNum;
        JTextField resultBox;
    
    public CalculatorView() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        addButton = new JButton("+");
        minusButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        modulusButton = new JButton("%");
        clearButton = new JButton("CLEAR");
        result = new JLabel("Result");
        num1tf = new JTextField(5);
        num2tf = new JTextField(5);
        firstNum = new JLabel("First Number");
        secondNum = new JLabel("Second Number");
        resultBox = new JTextField();
        
        panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        panel.setLayout(new GridLayout(6,2));
        panel.add(firstNum);
        panel.add(num1tf);
        panel.add(secondNum);
        panel.add(num2tf);
        panel.add(result);
        panel.add(resultBox);
        panel.add(addButton);
        panel.add(minusButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(modulusButton);
        panel.add(clearButton);
        
        frame.add(panel, BorderLayout.WEST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.pack();
        frame.setVisible(true);
        
    }
    
    public void allListeners(ActionListener a) {
        addButton.addActionListener(a);
        minusButton.addActionListener(a);
        multiplyButton.addActionListener(a);
        divideButton.addActionListener(a);
        modulusButton.addActionListener(a);
        clearButton.addActionListener(a);
    }
    
}
