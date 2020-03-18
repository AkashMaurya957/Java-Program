import javax.swing.*;
class JTextfield extends JFrame
{
JPanel JP;
JTextField First,Last;

JTextfield()
{
JP=new JPanel();
First=new JTextField();
First.setText("akash");

Last=new JTextField();
Last.setText("Maurya");

JP.add(First);
JP.add(Last);

setTitle("JTextField");
setSize(300,300);
setVisible(true);
add(JP);


}
public static void main(String arg[])
{



}

}