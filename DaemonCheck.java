class DoemonThread  extends Thread
{
public void run()
{
if(Thread.currentThread().isDaemon())
{
System.out.println("Thread Name :");

}
else
{
System.out.println("User Thread is Running");
}
}
public static void main(String arg[])
{
DaemonThread obj=new DaemonThread();
DaemonThread obj1=new DaemonThread();
DaemonThread obj2=new DaemonThread();

obj.setDoemon(true);
obj.start();

obj1.start();
obj2.start();


}
}
