
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;
public class AC11View {
   JButton AddButton;
   JButton SubButton;
   JButton DivButton;
   JButton MultButton;
   JButton ModButton;
   JButton ClearButton;
   JTextField num1;
   JTextField num2;
   JLabel Result;
   JTextField ResultF;
    public AC11View (){
    
        JFrame frame = new JFrame ();
        JPanel panel = new JPanel ();
        AddButton = new JButton ("+");
        SubButton = new JButton ("-");
        DivButton = new JButton ("/");
        MultButton = new JButton ("*");
        ModButton = new JButton ("%");
        ClearButton = new JButton ("clear");
        JLabel firstNumber = new JLabel("First Number");
        JLabel secondNumber = new JLabel("Second Number");
        ResultF = new JTextField(10);
        Result = new JLabel("Result: ");
        num1 = new JTextField(10);
        num2 = new JTextField(10);
        
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout(new GridLayout(0,2));
        panel.add(firstNumber);
        panel.add(num1);
        panel.add(secondNumber);
        panel.add(num2);
        panel.add(Result);
        panel.add(ResultF);
        panel.add(AddButton);
        panel.add(SubButton);
        panel.add(MultButton);
        panel.add(DivButton);
        panel.add(ModButton);
        panel.add(ClearButton);
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.pack();
        frame.setVisible(true);
        
}
    public void allListeneres(ActionListener a){
        AddButton.addActionListener(a);
        SubButton.addActionListener(a);
        DivButton.addActionListener(a);
        MultButton.addActionListener(a);
        ModButton.addActionListener(a);
        ClearButton.addActionListener(a);
    }
    
}
