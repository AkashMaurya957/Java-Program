import java.io.*;

class FilePermissionGetActionMethod
{
public static void main(String arg[])
{

FilePermission obj1=new FilePermission("akash","read,write,delete");
FilePermission obj2=new FilePermission("maurya","read,write,execute");
FilePermission obj3=new FilePermission("akash","read,delete,readlink");

String Ac=obj1.getActions();
System.out.println("Action Object 1 is "+Ac);

Ac=obj2.getActions();
System.out.println("Action Object 1 is "+Ac);

Ac=obj3.getActions();
System.out.println("Action Object 1 is "+Ac);

}
}
