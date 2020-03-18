class TestInterrupting extends Thread
{  
public void run()
{  
try
{  
Thread.sleep(1000);  
System.out.println("task");  
}
catch(InterruptedException e)
{  
System.out.println("Exception handled "+e);  
}  
System.out.println("thread is running...");  
}  
  
public static void main(String args[])
{  
TestInterrupting t1=new TestInterrupting();  
t1.start();  
  
t1.interrupt();  
  
}  
}  