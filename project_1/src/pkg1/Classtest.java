package pkg1;

public class Classtest
{
int narendra;
public void m1()
{
	System.out.println("First method");
	System.out.println("First method first line");
}
public void m2()
{
	System.out.println("Second method");
	System.out.println("Second method second line");
}
public static void main(String[] args)
{
	System.out.println("Main method first line");
	Classtest obj=new Classtest();
	System.out.println("Main method second line");
	obj.m1();
	System.out.println("Main method third line");
	System.out.println("Main method fourth line");
	obj.m2();
}
}
