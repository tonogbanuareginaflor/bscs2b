package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    View guiView;
    Controller(View guiView){
        this.guiView = guiView;
        guiView.allListener(new ActionButton());
    }

    class ActionButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == guiView.addButton){
                int num1 = Integer.parseInt(guiView.num1TF.getText());
                int num2 = Integer.parseInt(guiView.num2TF.getText());
                int sum = Model.addNumbers(num1, num2);
                guiView.result.setText(""+sum);
            } else if(e.getSource() == guiView.subButton){
                int num1 = Integer.parseInt(guiView.num1TF.getText());
                int num2 = Integer.parseInt(guiView.num2TF.getText());
                int difference = Model.subNumbers(num1, num2);
                guiView.result.setText(""+ difference);
            } else if(e.getSource() == guiView.mulButton){
                int num1 = Integer.parseInt(guiView.num1TF.getText());
                int num2 = Integer.parseInt(guiView.num2TF.getText());
                int product = Model.mulNumbers(num1, num2);
                guiView.result.setText(""+ product);
            } else if(e.getSource() == guiView.divButton){
                int num1 = Integer.parseInt(guiView.num1TF.getText());
                int num2 = Integer.parseInt(guiView.num2TF.getText());
                int quotient = Model.divNumbers(num1, num2);
                guiView.result.setText(""+ quotient);
            } else if(e.getSource() == guiView.modButton) {
                int num1 = Integer.parseInt(guiView.num1TF.getText());
                int num2 = Integer.parseInt(guiView.num2TF.getText());
                int modulo = Model.modNumbers(num1, num2);
                guiView.result.setText("" + modulo);
            } else if(e.getSource() == guiView.clearButton) {
                guiView.num1TF.setText("");
                guiView.num2TF.setText("");
                guiView.result.setText("");
            }
        }
    }
}