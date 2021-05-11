import java.awt.*;
import javax.swing.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91942
 */
public class BoxLyt extends Frame{
   Button buttons[];
   BoxLyt()
   {
       buttons=new Button[5];
       for(int i=0;i<5;i++)
       {
           buttons[i]=new Button("Btn"+(i+1));
           add(buttons[i]);
       }
       setLayout(new BoxLayout(this.BoxLayout.X_AXIS));
       setSize(400,400);
       setVisible(true);
   }

    private void add(Button button) {

    }

    private void setSize(int i, int i0) {

    }

    private void setVisible(boolean b) {

    }


}