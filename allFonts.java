import java.awt.*;
import java.awt.event.*;


class allFonts extends Frame {
  allFonts(){
    setBackground(new Color(70,70,70));
    setSize(1000, 1200);
    
    addWindowListener(new WindowAdapter()
    {
      public void windowClosing(WindowEvent e)
      {System.exit(0);
        }
    });
 }
 public void paint(Graphics g){
      Font font1 = new Font("TimesRoman",Font.PLAIN,35);
      g.setFont(font1);
      g.setColor(Color.WHITE);
      g.drawString("list of all fonts available in java awt :", 20, 60);
      setLayout(new FlowLayout());
      GraphicsEnvironment ge;
      ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      String[] names = ge.getAvailableFontFamilyNames();
      g.setColor(Color.BLUE);
      for (int i = 0,y=85; i < names.length; i++,y+=20) {
        
        Font font = new Font(names[i],Font.PLAIN,20);
        g.setFont(font);
        g.drawString(names[i], 30, y);
      }
 }
        public static void main(String[] args) {
            allFonts Demo = new allFonts();
            Demo.setTitle("All Fonts in awt");
            Demo.setVisible(true);
        }
    }