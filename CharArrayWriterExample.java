import java.io.CharArrayWriter;
import java.io.FileWriter;


class CharArrayWriterExample
{
public static void main(String arg[])
{
try
{
CharArrayWriter out=new CharArrayWriter();
out.write("Hello akash maurya");

FileWriter a1=new FileWriter("E:akash.txt");

FileWriter a2=new FileWriter("E:akash1.txt");

FileWriter a3=new FileWriter("E:akash2.txt");

FileWriter a4=new FileWriter("E:akash3.txt");

out.writeTo(a1);

out.writeTo(a2);

out.writeTo(a3);

out.writeTo(a4);

a1.close();

a2.close();

a3.close();

a4.close();

System.out.println("Success");

}
catch(Exception e)
{
System.out.println(e);
}
}
}