import  java.io.*;

class FilePermissionEqualsMethod
{
public static void main(String arg[])
{
boolean bool=false;

FilePermission obj1=new FilePermission("akash","read");
FilePermission obj2=new FilePermission("hacker","write");
FilePermission obj3=new FilePermission("akash","read");

bool=obj2.equals(obj1);
System.out.println(" wheather obj1 and obj2 are equals "+bool);

bool=obj2.equals(obj3);
System.out.println(" wheather obj1 and obj2 are equals "+bool);

bool=obj3.equals(obj1);
System.out.println(" wheather obj1 and obj2 are equals "+bool);
}
}