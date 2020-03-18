import java.io.*;
class Accept2D
{
int[][] a=new int[2][2];
int[][] b=new int[2][2];
int[][] c=new int[2][2];
int i,j,k,sum=0,max,min;

void accept() throws IOException
{
BufferedReader akash=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the value to store in array");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=Integer.parseInt(akash.readLine());

}
}
}

void display()
{
System.out.println("Output");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
void addition()
{
 for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
sum=sum+c[i][j];
}
}
 System.out.println("Sum of values"+sum);
}
   
void minvalue()
{

 for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
min=c[0][0];
if(c[i][j]<min)
{
min=c[i][j];
}
}
}
 System.out.println("Minimum value="+min);
}       


void maxvalue()
{
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
max=c[0][0];

if(c[i][j]>max)
{
max=c[i][j];
}
}       
}       
System.out.println("Maximum value"+max);
}
void store()
{

{
 for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
b[i][j]=a[i][j];

}
}
}

}
void add()
{
System.out.println("Addition of two Matrix1");
{
 for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
c[i][j]=b[i][j]+a[i][j];
System.out.print(c[i][j]+"\t");
}
System.out.println();
}
}

}
void Multipication()
{
c[i][j]=0;
System.out.println("Multiplication of two Matrix:");
{
 for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
for(k=0;k<2;k++)
{
c[i][j]=c[i][j]+a[i][k]*b[k][j];
System.out.println(c[i][j]);
}
}
System.out.println();

}
}

}

public static void main(String arg[]) throws IOException
{
Accept2D hacker=new Accept2D();
hacker.accept();
hacker.display();
hacker.store();
hacker.accept();
hacker.display();
hacker.add();
hacker.Multipication();
hacker.addition();
hacker.minvalue();
hacker.maxvalue();
}
}
