package pkg1;

public class Inherithw1
{
public Inherithw1()
{
	this(1,1,1);
	System.out.println("Parent default constructor");
}
public Inherithw1(int a)
{
	this();
	System.out.println("Parent one parameterized constructor");
}
	public Inherithw1(int a,int b)
	{
		this(1);
		System.out.println("Parent two parameterized constructor");
	}
		public Inherithw1(int a,int b,int c)
		{
			System.out.println("Parent three parameterized constructor");
		}
}
