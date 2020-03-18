import java.io.ObjectStreamClass;
import java.util.ArrayList;

class ForClassObjectStream
{
public static void main(String arg[])
{

ObjectStreamClass ob1=ObjectStreamClass.lookup(Number.class);

System.out.println(""+ob1.forClass());

ObjectStreamClass ob2=ObjectStreamClass.lookup(ArrayList.class);

System.out.println(""+ob2.forClass());
}

}