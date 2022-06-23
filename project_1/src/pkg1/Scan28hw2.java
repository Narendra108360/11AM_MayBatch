package pkg1;
import java.util.Scanner;
public class Scan28hw2
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("*(Enter first number) then press enter for (Enter second number)");
			int x1=s.nextInt();
			int x2=s.nextInt();
			int multi=x1*x2;
	System.out.println("The multiplication is = "+multi);
		System.out.println("*Enter the digit for subtraction");
	int x3=s.nextInt();
	int sub=multi-x3;	
		System.out.println("The subtracted value is = "+sub);
		System.out.println("*Enter the digit for multiplication");
	int x4=s.nextInt();
	int multip=sub*x4;
		System.out.println("The multiplied value is = "+multip);
		System.out.println("*Enter the digit for addition");
	int x5=s.nextInt();
	int add=multip+x5;
		System.out.println("The added value is = "+add);
		System.out.println("*Enter the digit for dividation");
	int x6=s.nextInt();
	int divi=add/x6;
		System.out.println("The final result is = "+divi);
		}
	}
//(((((x1*x2)-x3)*x4)+x5)/x6)