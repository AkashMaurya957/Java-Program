import java.io.*;

class BufferedOutput
{
public static void main(String arg[])
{
try
{
FileOutputStream obj=new FileOutputStream("E:\\maurya.txt");
BufferedOutputStream obj1=new BufferedOutputStream(obj);

String s="Hello Akash Maurya";
byte b[]=s.getBytes();
obj1.write(b);
obj1.flush();
obj1.close();
obj.close();
System.out.println("Succesfully text file created");

}
catch(Exception e)
{
System.out.println("Error :"+e);
}
}
}