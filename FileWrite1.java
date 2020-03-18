import java.io.*;
class FileWrite1
{
public static void main(String arg[])
{
String s="hello akash maurya";
byte buf[]=s.getBytes();
try(FileOutputStream obj=new FileOutputStream("E:\\akash3.txt"))
{
for(int i=0;i<buf.length;i++)
{

obj.write(buf[i]);

}

}
catch(Exception e)
{
System.out.println("Errro :"+e);
}
}
}