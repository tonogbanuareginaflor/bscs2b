import java.awt.event.*;

public class act11Controller {
    act11View act11View;
    
    act11Controller (Act11View act11View)
    {
        this.act11View = act11View;
        act11View.allListeneres(new ActionButton());
    }
    
    class ActionButton implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource()==act11View.AddButton){
               int num1 = Integer.parseInt(act11View.num1.getText());
               int num2 = Integer.parseInt(act11View.num2.getText());
               int sum = act11Model.getAdditionValue(num1,num2);
               String res = String.valueOf(sum);
               act11View.ResultF.setText(res);
        }
           if(e.getSource()==act11View.SubButton){
               int num1 = Integer.parseInt(act11View.num1.getText());
               int num2 = Integer.parseInt(act11View.num2.getText());
               int sum = act11Model.getSubtractionValue(num1,num2);
               String res = String.valueOf(sum);
               act11View.ResultF.setText(res);
        }
           if(e.getSource()==act11View.MultButton){
               int num1 = Integer.parseInt(act11View.num1.getText());
               int num2 = Integer.parseInt(act11View.num2.getText());
               int sum = act11Model.getMultiplicationValue(num1,num2);
               String res = String.valueOf(sum);
               act11View.ResultF.setText(res);
           }
           if(e.getSource()==act11View.DivButton){
               double num1 = Integer.parseInt(act11View.num1.getText());
               double num2 = Integer.parseInt(act11View.num2.getText());
               double sum = act11Model.getDivisionValue(num1, num2);
               String res = String.valueOf(sum);
               act11View.ResultF.setText(res);
           }
           
           if(e.getSource()==act11View.ModButton){
               int num1 = Integer.parseInt(act11View.num1.getText());
               int num2 = Integer.parseInt(act11View.num2.getText());
               int sum = act11Model.getModulusValue(num1, num2);
               String res = String.valueOf(sum);
               act11View.ResultF.setText(res);
           }
           
           if(e.getSource()==act11View.ClearButton){
               act11View.num1.setText(null);
               act11View.num2.setText(null);
               act11View.ResultF.setText(null);
           }
           
        
    }
    }
}
    