import java.io.File;
import java.io.PrintWriter;

class PrintWriterExample
{
public static void main(String arg[])
{
try
{

// By console method

PrintWriter out=new PrintWriter(System.out);

out.write("Hello akash maurya");
out.flush();
out.close();

//By File writer

PrintWriter ou=new PrintWriter(new File("E:\\m.txt"));



ou.write("Hello akash maurya");
ou.flush();
ou.close();

}
catch(Exception e)
{
System.out.println(e);
}
}
}