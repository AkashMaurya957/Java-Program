import java.io.PrintStream;
import java.io.FileOutputStream;

class PrintStreamExample
{
public static void main(String arg[])
{
try
{
FileOutputStream out=new FileOutputStream("E:\\maurya.txt");

PrintStream fout=new PrintStream(out);

fout.println("akash maurya");
fout.println("how are you?");
fout.println("Are you fine");
fout.println("And how was your mother");
fout.println("fine");
fout.println("@@@@@@");
System.out.println("Success");
}

catch(Exception e)
{

System.out.println(e);
}
}

}