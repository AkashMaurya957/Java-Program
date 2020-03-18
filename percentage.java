import java.io.*;
class percentage
{
 void cal() throws IOException
         
 {
 int a,b,c,d,e,sum,per;
 BufferedReader akash=new BufferedReader (new InputStreamReader(System.in));

 System.out.println("Enter the Marks Of first subject");
 a=Integer.parseInt(akash.readLine());
 System.out.println("Enter the Marks Of second subject");
b=Integer.parseInt(akash.readLine());
System.out.println("Enter the Marks Of third  subject");
c=Integer.parseInt(akash.readLine());
System.out.println("Enter the Marks Of fourth subject");
d=Integer.parseInt(akash.readLine());
System.out.println("Enter the Marks Of fifth subject");
e=Integer.parseInt(akash.readLine());
sum=a+b+c+d+e;
System.out.println("Total number = "+sum);
per=(sum/5);
System.out.println("Percentage = "+per);

}
public static void main(String arg[]) throws IOException
        
{
percentage re=new percentage();

re.cal();

}        

}