
import java.util.*;
class Student2
{
int rollno;
String name;
int age;
Student2(int rollno,String name,int age)
{
this.age=age;
this.name=name;
this.rollno=rollno;
}        
}

class UserRemoveArraylist
{
public static void main(String arg[])
{
Student2 s1=new Student2(1,"Akash Maurya",34);
Student2 s2=new Student2(2,"Adrash Saini",32);
Student2 s3=new Student2(3,"Anshul BAnsal",31);
Student2 s4=new Student2(4,"Monti Sagar",40);
Student2 s5=new Student2(5,"Arpit Sharma",47);
Student2 s6=new Student2(1,"Akash Maurya",34);
Student2 s7=new Student2(7,"Manoj Kumar",48);


ArrayList<Student2> list=new ArrayList<Student2>();
list.add(s1);
list.add(s2);
list.add(s3);
list.add(s4);
list.add(s5);
ArrayList<Student2> list2=new ArrayList<Student2>();
    
list2.add(s6);
list2.add(s7);
list2.remove(s6);

Iterator ln=list.iterator();
while(ln.hasNext())
{
Student2 ln1=(Student2)ln.next();
 System.out.println(ln1.rollno+" "+ln1.name+" "+ln1.age);
}

}
}