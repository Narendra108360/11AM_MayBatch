package pkg1;

public class assignment
{
public int sum(int a,int b)
{
	int c=a+b;
	System.out.println("Print the result of sum = "+c);
	return c;
}
public int add(int h,int i)
{
	int d=h+i;
	System.out.println("Print the result of add = "+d);
	return d;
}
public int sub(int j,int k)
{
	int e=j-k;
	System.out.println("Print the result of sub = "+e);
	return e;
}
public int multi(int l,int m)
{
	int f=l*m;
	System.out.println("Print the result of multi = "+f);
	return f;
}
public void divid(int n,int o)
{
	int g=n/o;
	System.out.println("The final rsult is = "+g);
	}
public static void main(String [] args)
{
assignment obj=new assignment();
int r=obj.sum(10,2);
int r1=obj.add(r,2);
int r2=obj.sub(r1,2);
int r3=obj.multi(r2,2);
obj.divid(r3,2);
}
}
