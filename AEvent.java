import java.awt.*;
import java.awt.event.*;
class AEvent extends Frame implements ActionListener
{
TextField tf;
AEvent()
{
if new TextField();
if.setBounds(60,50,170,20);
Button b=new Button("click here");
b.setBounds(100,120,80,30);
b.addActionListener(this);
add(b);
add(tf);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if.setText("Welcome");
}
public static void main(String args[])
{
new AEvent();
}
}