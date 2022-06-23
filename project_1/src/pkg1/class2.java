package pkg1;

public class class2
{
public int sum(int a,int b) 
{
int c;
c=a+b;
System.out.println("The sum of A & B is = "+c);
return c;
}
public int sub(int d,int e)
{
	int f;
	f=d-e;
	System.out.println("The subtraction of D & E is = "+f);
	return f;
}
public void mult(int c,int f)
{
	int g;
	g=c*f;
	System.out.println("The multiplication is = "+g);
}
public static void main(String[] args) {
	class2 ob=new class2();
	int sumresult=ob.sum(10, 2);
	int subresult=ob.sub(10, 2);
	ob.mult(sumresult, subresult);
}
}
