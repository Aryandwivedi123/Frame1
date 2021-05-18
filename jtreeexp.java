import javax.swing.*;  
import javax.swing.tree.*;  
public class jtreeexp extends JFrame{  
  
   jtreeexp(){  
      
    DefaultMutableTreeNode sport=new DefaultMutableTreeNode("sport");  
    DefaultMutableTreeNode Indoor=new DefaultMutableTreeNode("Indoor");  
    DefaultMutableTreeNode Outdoor=new DefaultMutableTreeNode("Outdoor");  
    sport.add(Indoor);  
    sport.add(Outdoor);  
    DefaultMutableTreeNode chess=new DefaultMutableTreeNode("table tennis");  
    DefaultMutableTreeNode charrom=new DefaultMutableTreeNode("cards");  
    DefaultMutableTreeNode cricket=new DefaultMutableTreeNode("ruby");  
    DefaultMutableTreeNode football=new DefaultMutableTreeNode("basketball");  
    Indoor.add(table tennis); 
	Indoor.add(cards); 
	Outdoor.add(ruby); 
	Outdoor.add(basketball);      
    JTree jt=new JTree(sport);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
    add(jt);  
    setSize(500,500);  
    setVisible(true);  
}  
public static void main(String[] args) {  
    new jtreeexp();  
}}  