import java.io.*;

class BufferedInput
{
public static void main(String arg[])
{
try
{
FileInputStream obj=new FileInputStream("E:\\maurya.txt");
BufferedInputStream obj1=new BufferedInputStream(obj);

int i;
while((i=obj1.read())!=-1)
{
System.out.print((char)i);
}
obj1.close();
obj.close();


}
catch(Exception e)
{
System.out.println("Error :"+e);
}
}
}