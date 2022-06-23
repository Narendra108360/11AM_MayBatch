package pkg1;

public class Selenium extends Automation
{
	public Selenium(int a,int b,int c)
	{
		System.out.println("Child three parameterized constructor");
	}
	public Selenium(int a,int b)
	{
		super(108,360);
		System.out.println("Child two parameterized constructor");
	}
	public Selenium(int a)
	{
		System.out.println("Child one parameterized constructor");
	}
	public static void main(String[] args)
	{
		Selenium s=new Selenium(11,01);
		
	}
}
