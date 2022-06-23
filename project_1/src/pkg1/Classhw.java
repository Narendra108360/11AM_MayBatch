package pkg1;

public class Classhw {
	public Classhw(int a,int b,int c)
	{
		this(1,1);
	System.out.println("Three Parameterized Constructor");
	}
	public Classhw(int a,int b)
	{
		this(1);
	System.out.println("Two Parameterized Constructor");	
	}
	public Classhw(int a)
	{
		System.out.println("One Paramerized Constructor");	
	}
	public Classhw(int a,int b,int c,int d)
	{
		this(1,1,1);
		System.out.println("Four Paramerized Constructor");	
	}
	public static void main(String[] args)
	{
		Classhw ref=new Classhw(1,1,1,1);
	}
}
