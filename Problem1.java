import java.util.*;
public class Problem1
{
public void ShowMenu()
{
int option;
Scanner akash=new Scanner(System.in);
System.out.println("-----Menu-----");
System.out.println("1.Play");
System.out.println("2.Instruction");
System.out.println("3.Exit");
System.out.println("Choose Option:");
option=akash.nextInt();

}
public static void main(String arg[])
{
Problem1 menu=new Problem1();
menu.ShowMenu();

}

}