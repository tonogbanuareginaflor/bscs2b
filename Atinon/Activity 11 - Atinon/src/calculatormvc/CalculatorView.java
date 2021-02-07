package calculatormvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView {
        
        JButton divideButton;
        JButton addButton;
        JButton minusButton;
        JButton multiplyButton;
        JButton modulusButton;
        JButton clearButton;
        JTextField inputnum1;
        JTextField inputnum2;
        JLabel result;
        JLabel firstNum;
        JLabel secondNum;
        JTextField boxResult;

    public CalculatorView() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        clearButton = new JButton("CLEAR");
        addButton = new JButton("+");
        minusButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        modulusButton = new JButton("%");
        inputnum1 = new JTextField(5);
        inputnum2 = new JTextField(5);
        firstNum = new JLabel("First Number");
        secondNum = new JLabel("Second Number");
        result = new JLabel("Result");
        boxResult = new JTextField();

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        panel.setLayout(new GridLayout(6,2));
        panel.add(firstNum);
        panel.add(inputnum1);
        panel.add(secondNum);
        panel.add(inputnum2);
        panel.add(result);
        panel.add(boxResult);
        panel.add(addButton);
        panel.add(minusButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(modulusButton);
        panel.add(clearButton);

        frame.add(panel, BorderLayout.WEST);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator MVC");
        frame.pack();
        frame.setVisible(true);

    }

    public void allListeners(ActionListener maku) {
        addButton.addActionListener(maku);
        minusButton.addActionListener(maku);
        multiplyButton.addActionListener(maku);
        divideButton.addActionListener(maku);
        modulusButton.addActionListener(maku);
        clearButton.addActionListener(maku);
    }

}
