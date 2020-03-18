import java.io.*;
class Table
{
public static void main(String arg[]) throws IOException
{
int num,i;
BufferedReader akash=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the value to print table");
num=Integer.parseInt(akash.readLine());
System.out.println("Output");

for(i=1;i<=10;i++)
{
System.out.println(num+"x"++i+"="+num*i);
}

}

}