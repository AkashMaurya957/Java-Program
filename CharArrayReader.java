import java.io.*;

class CharArrayReader
{
public static void main(String arg[])
{
char[] ary={'a','b','c','d','e','r','o','p','t','h'};

CharArrayReader akash=new CharArrayReader(ary);

int k=0;
while(k=akash.read()!=-1)
{
char ch=(char)k;
System.out.println(ch+" : "+k);
}

}

}