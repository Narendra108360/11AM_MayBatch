package pkg1;

public class Classcw
{
	public Classcw(int a)
	{
	System.out.println("One Parameterized Constructor");
	}
	public Classcw()
	{
		this(111,222);
	System.out.println("Default Constructor");	
	}
	public Classcw(int c,int b)
	{
		System.out.println("Two Paramerized Constructor");	
	}
	public static void main(String[] args)
	{
		Classcw ref1=new Classcw(111);
		Classcw ref=new Classcw();
	Classcw ref2=new Classcw(111,222);
	}
}
