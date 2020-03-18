import javax.swing.*;
import java.awt.*;

class BorderLayoutDemo extends JFrame
{
JButton reset,update,add,delete;

BorderLayoutDemo()
{
add=new JButton("Add");
update=new JButton("Update");
delete=new JButton("Delete");
reset=new JButton("Reset");

setVisible(true);
setSize(400,400);
setTitle("BorderLayout");

setLayout (new BorderLayout());
add(add,BorderLayout.NORTH);
add(update,BorderLayout.EAST);
add(delete,BorderLayout.SOUTH);
add(reset,BorderLayout.WEST);
}
public static void main(String arg[])
{
BorderLayoutDemo obj=new BorderLayoutDemo(); 

}
}