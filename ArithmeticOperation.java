package Week1;
import java.util.Scanner;

public class ArithmeticOperation 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double x,y,z;
		
		System.out.println("Enter the value of x");
		x=sc.nextDouble();
		System.out.println("Enter the value of y");
		y=sc.nextDouble();
		z=x+y;
		System.out.println("Addition of x and y is : "+z);
		z=x-y;
		System.out.println("Substraction of x and y is : "+z);
		z=x*y;
		System.out.println("Multiplication of the x and y is : "+z);
		z=x/y;
		System.out.println("Division of x and y is : "+z);
	}

}
