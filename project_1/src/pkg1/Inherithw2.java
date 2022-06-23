package pkg1;

public class Inherithw2 extends Inherithw1
{
public Inherithw2()
{
	super(1,1);
	System.out.println("Child default constructor");
}
public Inherithw2(int a)
{
	this(1,1);
	System.out.println("Child one parameterized constructor");
}
public Inherithw2(int a,int b)
{
	this(1,1,1);
	System.out.println("Child two parameterized constructor");
}
public Inherithw2(int a,int b,int c)
{
	this();
	System.out.println("Child three parameterized constructor");
}
public static void main(String[] args)
{
	Inherithw2 i=new Inherithw2(1);
}
}
