package pkg1;

public class june4assign2
{
public void m1()
{
	System.out.println("Parent default method");
	this.m2(1);
}
public void m2(int a)
{
	System.out.println("Parent one parameterized method");
	this.m3(1, 1);
}
public void m3(int a,int b)
{
	System.out.println("Parent two parameterized method");
}
public void m4(int a,int b, int c)
{
	System.out.println("Parent three parameterized method");
	this.m1();
}
}
