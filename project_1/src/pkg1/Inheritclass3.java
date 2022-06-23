package pkg1;

public class Inheritclass3 extends Inheritclass2
{
public void m3()
{
	System.out.println("I am the third method");
}
public static void main(String[] args)
{
	Inheritclass3 s=new Inheritclass3();
	s.m1();
	s.m2();
	s.m3();
}
}
