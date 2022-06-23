package pkg1;

public class Class28this
{
int narendra;
public void m1(int naren)
{
this.narendra=naren;	
}
public static void main(String[] args)
{
	Class28this obj=new Class28this();
	obj.m1(108);
System.out.print(obj.narendra);
}
}
