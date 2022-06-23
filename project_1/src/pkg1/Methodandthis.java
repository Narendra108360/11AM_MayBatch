package pkg1;
public class Methodandthis 
{
	public void m1()
	{
	System.out.println("I am the default parameterized method");
	}
	public void m2()
	{
	System.out.println("I am the one parameterized method");
	this.m3();
	}
	public void m3()
	{
	System.out.println("I am the two parameterized method");
	this.m5();
	}
	public void m4()
	{
	System.out.println("I am the three parameterized method");
	this.m1();	this.m2();
	}
	public void m5()
	{
	System.out.println("I am the four parameterized method");
	}
public static void main(String[] args) {
Methodandthis ref=new Methodandthis();	
ref.m4(); }	
}
