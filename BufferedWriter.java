import java.io.*;

class BufferedWriter
{
public static void main(String arg[]) throws Exception
{
FileWriter w=new FileWriter("E:\\high.txt");
BufferedWriter buf=new BufferedWriter(w);
buf.write("hello");
buf.close();
System.out.println("Success");
}
}