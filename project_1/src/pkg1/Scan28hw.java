package pkg1;
import java.util.Scanner;
public class Scan28hw
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("*(Enter first number) then press enter for (Enter second number)");
			int x1=s.nextInt();
			int x2=s.nextInt();
			int a=x1+x2;
	System.out.println("The sum is = "+a);
		System.out.println("*Enter the digit for subtraction");
	int x3=s.nextInt();
	int b=a-x3;	
		System.out.println("The subtracted value is = "+b);
		System.out.println("*Enter the digit for addition");
	int x4=s.nextInt();
	int c=b+x4;
		System.out.println("The added value is = "+c);
		System.out.println("*Enter the digit for multiplication");
	int x5=s.nextInt();
	int d=c*x5;
		System.out.println("The multiplied value is = "+d);
		System.out.println("*Enter the digit for dividation");
	int x6=s.nextInt();
	int e=d/x6;
		System.out.println("The final result is = "+e);
		}
}
//((((x1+x2)-x3)+x4)*x5)/x6)