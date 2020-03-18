class TestFunction
{
static int i=0;
static void inc()
{
i++;
System.out.println("i="+i);
}
public static void main(String arg[])
{
TestFunction.inc();
TestFunction.inc();
TestFunction.inc();

}


}