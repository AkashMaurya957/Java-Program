import java.io.*;

class WriterExample
{
public static void main(String arg[])
{
try
{
Writer w=new FileWriter("E:\\hacker.txt");
String content="Hello akash Maurya";
w.write(content);
w.close();
System.out.println("Done,File is created");
}
catch(Exception e)
{
e.printStackTrace();
}
}
}