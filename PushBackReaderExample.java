import java.io.*;

class PushBackReaderExample
{
public static void main(String arg[])
{
try
{
char ary[]={'1','-','-','7','-','3','-','-','-','6','7','7'};
CharArrayReader akash=new CharArrayReader(ary);
PushbackReader push=new PushbackReader(akash);

int i;

while((i=push.read())!=-1)
{
if(i=='-')
{
int j;
if((j=push.read())!=-1)
{
System.out.print("+++");
}
else
{
push.unread(j);
System.out.print((char)i);
}
}
else
{

System.out.print((char)i);
}
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}