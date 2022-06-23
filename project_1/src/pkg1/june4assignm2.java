package pkg1;

public class june4assignm2 extends june4assign2
{
public void m5()
{
	System.out.println("Child default method");
	this.m6(1);
}
public void m6(int a)
{
	System.out.println("Child one parameterized method");
	this.m8(1,1,1);
}
public void m7(int a,int b)
{
	super.m4(1,1,1);
	System.out.println("Child two parameterized method");
	this.m5();
}
public void m8(int a,int b,int c)
{
	System.out.println("Child three parameterized method");
}
public static void main(String[] args)
{
	june4assignm2 obj=new june4assignm2();
	obj.m7(1,1);
}
}
