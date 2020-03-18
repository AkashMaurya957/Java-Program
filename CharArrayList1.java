import java.io.CharArrayReader;

public class CharArrayList1
{
public static void main(String arg[])
{
try
{
char[]ary={'a','s','d','f','g','h','j','k','l'};
CharArrayReader reader=new CharArrayReader(ary);

int k=0;
while((k=reader.read())!=-1)
{
char ch=(char)k;
System.out.print(ch+" : ");
System.out.println(k);

}
}
catch(Exception e)
{
System.out.println(e);
}
}

}