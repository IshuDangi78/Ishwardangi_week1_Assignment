package Week1;
import java.util.Scanner;

public class ChecksEvenOrOdd
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double a;
		System.out.println("Enter the value of a");
		a=sc.nextDouble();
		if(a%2==0)
		{
			System.out.println(a+" is the Even Number ");
		}
		else
		{
			System.out.println(a+" is the Odd Number ");
		}
	}

}
