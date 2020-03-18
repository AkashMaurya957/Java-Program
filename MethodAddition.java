import java.io.*;
class MethodAddition
{
int[] a=new int[10];
int i,sum=0,min,max;

void accept() throws IOException
{
BufferedReader akash=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the value to Store in Array");
for(i=0;i<=10;i++)
{
a[i]=Integer.parseInt(akash.readLine());
}

}

void display()
{
System.out.println("Output");
for(i=0;i<=10;i++)
{
System.out.print(a[i]+"\t");
}

}
void addvalue()
{

for(i=0;i<=10;i++)
{
sum=sum+a[i];
}
System.out.println("Sum of Values"+sum);
}

void minvalue()
{
for(i=0;i<=10;i++)
{
min=a[0];
if(a[i]<min)
{
min=a[i];
}

}
System.out.println("Minium value is : "+min);
}
public static void main(String arg[]) throws IOException
{
MethodAddition hacker=new MethodAddition();
hacker.accept();
hacker.display();
hacker.addvalue();
hacker.minvalue();


}

}
