package pkg1;

public class Inheritclass2 extends Inheritclass1
{
public void m2()
{
	System.out.println("I am child method");
}
public static void main(String[] args)
{
	Inheritclass2 obj=new Inheritclass2();
	obj.m1();
	obj.m2();
	obj.narendra=108;
	System.out.println(obj.narendra);
}
}
