package MVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class View {
    JButton addButton, subButton, mulButton, divButton, modButton, clearButton;
    JTextField num1TF;
    JTextField num2TF;
    JTextField result;
    JLabel label1, label2, label3;

    public View() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        num1TF =  new JTextField();
        num1TF.setHorizontalAlignment(JTextField.RIGHT);
        num1TF.setSelectedTextColor(Color.RED);
        num1TF.setSelectionColor(Color.YELLOW);
        num1TF.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD,15));
        label1 = new JLabel("First Number      ");
        num2TF = new JTextField();
        num2TF.setHorizontalAlignment(JTextField.RIGHT);
        num2TF.setSelectedTextColor(Color.RED);
        num2TF.setSelectionColor(Color.YELLOW);
        num2TF.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD,15));
        label2 = new JLabel("Second Number     ");
        label3 = new JLabel("Result            ");
        result = new JTextField();
        result.setHorizontalAlignment(JTextField.RIGHT);
        result.setForeground(Color.BLUE);
        result.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD,15));
        result.setEditable(false);
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("x");
        divButton = new JButton("/");
        modButton = new JButton("%");
        clearButton = new JButton("C");



        panel.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
        panel.setLayout(new GridLayout(7,2));

        panel.add(label1);
        panel.add(num1TF);
        panel.add(label2);
        panel.add(num2TF);
        panel.add(label3);
        panel.add(result);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(modButton);
        panel.add(clearButton);


        // setup the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing Arithmetics");
        frame.pack();
        frame.setVisible(true);

    }

    public void allListener(ActionListener a){
        addButton.addActionListener(a);
        subButton.addActionListener(a);
        mulButton.addActionListener(a);
        divButton.addActionListener(a);
        modButton.addActionListener(a);
        clearButton.addActionListener(a);
    }

}

