class constructor
{

constructor()

{

System.out.println("constructor is called");
}

constructor(String name)
{

System.out.println("User name "+name );
}
public static void main(String arg[])

{
constructor obj1=new constructor();
constructor obj2=new constructor("akash");

}

}