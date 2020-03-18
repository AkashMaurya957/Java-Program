import java.io.*;
class Divide
{
public static void main(String arg[])
{
int n1,n2,res=0;
try
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the First Number ");
n1=Integer.parseInt(br.readLine());
System.out.println("Enter the Second Number ");
n2=Integer.parseInt(br.readLine());
res=n1/n2;

}
catch(Exception e)
{
System.out.println("Error :"+e);
}
finally
{
System.out.println("Result is :"+res);
}
}
}
