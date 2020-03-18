import java.io.Console;

class ReadPasswordConsole
{
public static void main(String arg[])
{
Console c=System.console();
System.out.println("Enter your password");
char[] ch=c.readPassword();
String pass=String.valueOf(ch);
System.out.println("Your password  " +pass);

}

}