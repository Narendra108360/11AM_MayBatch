package pkg1;

public class Student {
int Rollno;
int Age;

public void display()
{
	System.out.print("The roll number of the student is = ");
}
public void display2()
{
	System.out.print("The age of the student is = ");
}
public static void main(String[]args)
{
	Student str=new Student();
	str.Rollno=11;
	str.Age=10;
	str.display();
	System.out.println(str.Rollno);
	str.display2();
	System.out.println(str.Age);
}
}
