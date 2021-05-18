import java.awt.*;
import java.awt.event.*;
class myradio extends Frame implements ItemListener
{
   CheckboxGroup cb;
   Checkbox a,b;
   {
     myradio()
	 { addWindowListener( new WindowAdapter()
      {
    public void windowClosing(WindowEvent we)
	{
	  System.exit(0);
	}
	});
	   setLayout(new FlowLayout());
	   cb=new CheckboxGroup();
	   a=new Checkbox("yes",cb,true);
	   b=new Checkbox("no",cb,false);
	   add(a);
	   add(b);
	   a.addItemListener(this);
	   b.addItemListener(this);
	  
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
		
	}
	public static void main(String [] args)
	{
	  myradio r=new myradio();
	  r.setSize9(400,400);
	  r.setVisible(true);
	  r.setTitle("radio button checking");
	  }
	  
   }