import java.io.FileReader;

class FileReaderExample
{
public static void main(String arg[])
{
try
{
FileReader fr=new FileReader("E:\\hacker.txt");

int i;
while((i=fr.read())!=-1)
System.out.print((char)i);
fr.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
} 