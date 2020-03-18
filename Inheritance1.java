class ElectronicDevice
{
void On()
{
System.out.println("ON");        
}
void Off()
{
System.out.println("Off");
}
}
class Tv extends ElectronicDevice
{
void display()
{
System.out.println("Hello Akash ");
}
}

class Inheritance1
{
public static void main(String arg[])
{
Tv obj=new Tv();
obj.On();
obj.Off();
obj.display();
}
}