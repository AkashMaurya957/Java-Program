import java.io.*;

class HashCodeMethod
{
public static void main(String args[])
{
FilePermission obj=new FilePermission("akash","read,write,delete");

int i=obj.hashCode();
System.out.println("HashCode for the Object "+i);
}

}