import java.awt.event.*;

public class AC11Controller {
    AC11View aC11View;
    
    AC11Controller (AC11View aC11View)
    {
        this.aC11View = aC11View;
        aC11View.allListeneres(new ActionButton());
    }
    
    class ActionButton implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource()==aC11View.AddButton){
               int num1 = Integer.parseInt(aC11View.num1.getText());
               int num2 = Integer.parseInt(aC11View.num2.getText());
               int sum = AC11Model.getAdditionValue(num1,num2);
               String res = String.valueOf(sum);
               aC11View.ResultF.setText(res);
        }
           if(e.getSource()==aC11View.SubButton){
               int num1 = Integer.parseInt(aC11View.num1.getText());
               int num2 = Integer.parseInt(aC11View.num2.getText());
               int sum = AC11Model.getSubtractionValue(num1,num2);
               String res = String.valueOf(sum);
               aC11View.ResultF.setText(res);
        }
           if(e.getSource()==aC11View.MultButton){
               int num1 = Integer.parseInt(aC11View.num1.getText());
               int num2 = Integer.parseInt(aC11View.num2.getText());
               int sum = AC11Model.getMultiplicationValue(num1,num2);
               String res = String.valueOf(sum);
               aC11View.ResultF.setText(res);
           }
           if(e.getSource()==aC11View.DivButton){
               double num1 = Integer.parseInt(aC11View.num1.getText());
               double num2 = Integer.parseInt(aC11View.num2.getText());
               double sum = AC11Model.getDivisionValue(num1, num2);
               String res = String.valueOf(sum);
               aC11View.ResultF.setText(res);
           }
           
           if(e.getSource()==aC11View.ModButton){
               int num1 = Integer.parseInt(aC11View.num1.getText());
               int num2 = Integer.parseInt(aC11View.num2.getText());
               int sum = AC11Model.getModulusValue(num1, num2);
               String res = String.valueOf(sum);
               aC11View.ResultF.setText(res);
           }
           
           if(e.getSource()==aC11View.ClearButton){
               aC11View.num1.setText(null);
               aC11View.num2.setText(null);
               aC11View.ResultF.setText(null);
           }
           
        
    }
    }
}
    

