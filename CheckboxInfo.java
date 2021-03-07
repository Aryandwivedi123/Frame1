import java.awt.*;
import java.awt.event.*;
public class CheckboxInfo extends Frame implements ItemListener{
	String msg="";
	Checkbox c1,c2,c3,c4,c5;
	CheckboxInfo(){
		setLayout(new FlowLayout());
		c1 = new Checkbox("Name");
		c2 = new Checkbox("Enrollment no.");
		c3 = new Checkbox("Branch");
		c4 = new Checkbox("Subject code");
		c5 = new Checkbox("Year");
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	public void itemStateChanged(ItemEvent ie){
		repaint();
	}
	public void paint(Graphics g){
		g.drawString("Show state: ",10,80);
		msg="Aryan Dwivedi "+ c1.getState();
		g.drawString(msg,10,100);
		msg="19100BTCSICS05423"+ c2.getState();
		g.drawString(msg,10,120);
		msg="CSE  "+ c3.getState();
		g.drawString(msg,10,140);
		msg="BTCS-409  "+c4.getState();
		g.drawString(msg,10,160);
		msg="2nd  "+c5.getState();
		g.drawString(msg,10,180);
	}
	public static void main(String args[]){
		CheckboxInfo cb= new CheckboxInfo();
		cb.setTitle("checkbox");
		cb.setSize(700,700);
		cb.setVisible(true);
	}
}
		