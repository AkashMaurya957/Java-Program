import java.io.ObjectStreamClass;
import java.util.ArrayList;


class getSerialNumber
{
public static void main(String arg[])
{

ObjectStreamClass akash=ObjectStreamClass.lookup(Number.class);

System.out.println(""+akash.getField("akash"));

System.out.println(""+akash.getFields());

System.out.println(""+akash.getClass());

System.out.println(""+akash.getSerialVersionUID());

System.out.println(""+akash.toString());

System.out.println(""+akash.getName());


}
}
 