class PolyDemo1
{    
void PolyDemo1()
{
System.out.println("Program Started");
}

void PolyDemo1(String name)
{
System.out.println("User name:"+name);
}

void PolyDemo1(int age)
{
System.out.println("Age of User:"+age);
}

void PolyDemo1(String name,int age)
{
System.out.println("User Name : "+name+"\n"+"Age : "+age);
}

}

class PolymorphismConstructorOverloading
{
public static void main(String arg[])
{
PolyDemo1 akash=new PolyDemo1();
PolyDemo akash1 = new PolyDemo1("Akash Maurya");
PolyDemo1 akash2=new PolyDemo1(20);
PolyDemo1 akash3=new PolyDemo1("Akash Maurya",20);
}
} 
 
