class Akash implements Runnable
{
int i;
public void run()
{
try
{
for(i=0;i<10;i++)
{
System.out.println(i);
Thread.sleep(1000);
}
if(i==10)
{
System.out.println("Time UP");
}

}
catch(Exception e)
{

}
}        
}


class Maurya implements Runnable
{
int i;
public void run()
{
try
{
for(i=0;i<10;i++)
{
System.out.println(i);
Thread.sleep(1000);
}
if(i==10)
{
System.out.println("Time UP");
}

}
catch(Exception e)
{

}
}        
}

Class ThreadDemo 
{
public static void main(String arg[])
{
Akash obj=new Akash();
Maurya obj2=new Maurya();

Thread t=new Thread(obj);
Thread r=new Thread(obj2);

t.start();
r.start();
}
}