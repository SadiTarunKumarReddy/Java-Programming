			//Java Program to Find LCM of 2 numbers

import java.util.Scanner;

class LcmOfTwoNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers: ");
		System.out.println();
		
		System.out.println("Enter 1st Number: ");
		int x = sc.nextInt();

		System.out.println("Enter 2nd Number: ");
		int y = sc.nextInt();

		//*** IMP TO KNOW FROM HERE TO

		int ans = (x>y)? x:y;
		while(true)
		{
			if(ans%x==0 && ans%y==0)
			break;
			ans++;
		}
		
		//*** TILL HERE

		System.out.println("LCM of 2 numbers is: "+ans);
		
	}
}