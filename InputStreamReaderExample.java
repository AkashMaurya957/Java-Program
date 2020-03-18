import java.io.*;

class InputStreamReaderExample
{
public static void main(String arg[])
{
try
{
InputStream stream=new FileInputStream("output.txt");

Reader akash=new InputStreamReader(stream);

int data=akash.read();

while(data!=-1)
{
System.out.print((char)data);
data=akash.read();

}
}
catch(Exception e)
{
System.out.println(e);
}

}

}