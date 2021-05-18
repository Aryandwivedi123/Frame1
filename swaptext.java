import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class swapText {
public static void main(String[] args) {
Frame frame = new Frame("Frame");
Label label1 = new Label("First");
Label label2 = new Label("Second");
TextField textField1 = new TextField(10);
TextField textField2 = new TextField(10);
Button button = new Button("OK");
frame.add(label1);
frame.add(textField1);
frame.add(label2);
frame.add(textField2);
frame.add(button);
frame.setLayout(new FlowLayout());
button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String temp = textField1.getText();
textField1.setText(textField2.getText());
textField2.setText(temp);
}});
frame.setSize(500,500);
frame.setVisible(true);
}
}