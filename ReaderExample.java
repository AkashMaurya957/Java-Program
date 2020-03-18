import java.io.*;

class ReaderExample
{
public static void main(String arg[])
{
try
{
Reader w=new FileReader("E:\\hacker.txt");
int read=w.read();
while(read!=-1)
{
System.out.print((char)read);
read=w.read();
}
w.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}