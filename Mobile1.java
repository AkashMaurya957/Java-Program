import java.io.*;
class Mobile1
{
String modelname;
int price;

void accept() throws IOException
{
BufferedReader sr=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Model Name");
modelname=sr.readLine();
System.out.println("Enter Price Of Model");
price=Integer.parseInt(sr.readLine());
}
void display()
{

System.out.println("Model Name  "+modelname);
System.out.println("Price  "+price);
}
public static void main(String arg[]) throws IOException
{
Mobile1 object=new Mobile1();
object.accept();
object.display();
}
        
}