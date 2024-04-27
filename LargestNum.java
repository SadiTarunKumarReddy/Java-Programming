			//Java Program to Find the Largest of three Numbers

import java.util.Scanner;

class LargestNum
{
	public static void main(String[] args)
	
	{
		System.out.println("Enter Three Numbers: ");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int x = sc.nextInt();
		
		System.out.println("Enter 2nd Number: ");
		int y = sc.nextInt();

		System.out.println("Enter 3rd Number: ");
		int z = sc.nextInt();

		if(x>y && x>z)
		{
			System.out.println("Largest Number is "+x);
			System.out.println();

		}
		else if(y>z && y>x)
		{
			System.out.println("Largest Number is "+y);
			System.out.println();
		}
		else
		{
			System.out.println("Largest Number is "+z);
			System.out.println();
		}
	}
	
}