import java.awt.*;
import java.awt.event.*;

public class langKnowButton extends Frame implements ActionListener{
    Button b1,b2,b3,b4;
    String str;
    TextField tf1 = new TextField(30);
    langKnowButton(){
        setLayout(null);
        b1 = new Button("Hindi");
        b2 = new Button("English");
        b3 = new Button("Both");
        b4 = new Button("None of them");
        b1.setBounds(200, 155, 120, 100);
        b2.setBounds(350,175, 100, 100);
        b3.setBounds(260, 300, 80, 100);
        b4.setBounds(350, 300, 140, 100);
        tf1.setBounds(200, 350, 300, 80);
        Font f = new Font("TimesRoman",Font.PLAIN,25);
        tf1.setFont(f);
        tf1.setBackground(new Color(100,100,100));
        tf1.setForeground(Color.BLUE);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        add(b1); 
        add(b2); 
        add(b3);
        add(b4); 
        add(tf1);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    
    public void actionPerformed(ActionEvent ae){
        str = ae.getActionCommand();
        if(str.equals("Hindi"))
           tf1.setText("You know Hindi");
        if(str.equals("English"))
           tf1.setText("You know English");
        if(str.equals("Both"))
           tf1.setText("You know both Hindi and English");
        if(str.equals("None of them"))
           tf1.setText("You know none of them");
    }
    public void paint(Graphics g){
        Font font = new Font("TimesRoman",Font.PLAIN,35);
        g.setColor(Color.BLUE);
        g.setFont(font);
        g.drawString("Select the language you know :",180,100);
        
    }
    public static void main(String[] args) {
        langKnowButton b = new langKnowButton();
        b.setSize(1000,500);
        b.setTitle("Languages Known");
        b.setVisible(true);
        b.setBackground(new Color(100,100,100));
    }
}