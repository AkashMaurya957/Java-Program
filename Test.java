class Test
{
static int i=0;

void inc()
{
i++;
System.out.println("i="+i);
}

public static void main(String arg[])
{

Test obj1=new Test();
Test obj2=new Test();
obj1.inc();
obj2.inc();
}

}