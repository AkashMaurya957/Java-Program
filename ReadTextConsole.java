import java.io.Console;

class ReadTextConsole
{
public static void main(String arg[])
{

Console c=System.console();
System.out.println("Enter Your name");
String name=c.readLine();
System.out.println("Welcome"+name);

}
}