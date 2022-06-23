package pkg1;

public class Class28
{
	int narendra; //global variable (out from method)
public void m1(int naren)
{
	narendra=naren; //local variable (inside the method)
}
public static void main(String[] args)
{
	Class28 obj=new Class28();
	obj.m1(108);
	System.out.print(obj.narendra);
}
}
