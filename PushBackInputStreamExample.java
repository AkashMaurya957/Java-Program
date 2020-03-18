import java.io.*;

class PushBackInputStreamExample
{
public static void main(String arg[])
{
try
{
String ak="aakkakakakaaaa";

byte ar[]=ak.getBytes();

ByteArrayInputStream array=new ByteArrayInputStream(ar);
PushbackInputStream akash=new PushbackInputStream(array);
int i;
while((i=akash.read())!=-1)
if(i=='a')
{
int j;
if((j=akash.read())=='a')
{
System.out.print("@@");
}
else
{
akash.unread(j);
System.out.print((char)i);
}

}
else
{
System.out.print((char)i);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
