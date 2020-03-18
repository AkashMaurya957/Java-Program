import java.io.*;
class addition
{
public static void main(String arg[]) throws IOException
{
int v1,v2,v3;
InputStreamReader sr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(sr);

System.out.println("Enter First value");
v1=Integer.parseInt(br.readLine());

System.out.println("Enter second value");
v2=Integer.parseInt(br.readLine());
v3=v1+v2;
System.out.println("Addition of two numbers:"+v3);

}

}