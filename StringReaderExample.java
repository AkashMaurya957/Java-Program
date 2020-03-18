import java.io.*;

class StringReaderExample
{
public static void main(String arg[])
{
try
{
String akash="How are you brother??";

StringReader ak=new StringReader(akash);

int k=0;

while((k=ak.read())!=-1)
{

System.out.print((char)k);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}