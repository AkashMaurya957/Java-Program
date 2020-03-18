import java.io.ObjectStreamClass;  
import java.util.Calendar;  
  
public class ObjectStreamClassExample  extends Serializable
 
{  
     public static void main(String[] args) {  
             
          // create a new object stream class for Integers  
          ObjectStreamClass osc = ObjectStreamClass.lookup(String.class);  
  
          // get the value field from ObjectStreamClass for integers  
          System.out.println("" + osc.getField("value"));  
  
          // create a new object stream class for Calendar  
          long osc2 = long.getSerialVersionUID(Calendar.class);  
  
          // get the Class instance for osc2  
          System.out.println("" + osc2.getField("isTimeSet"));  
  
       }  
}  