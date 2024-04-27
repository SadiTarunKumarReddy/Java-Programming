			//Instance Variable by using calling 

import java.util.Scanner;

class InstCall
{	

	public static void main(String[] args)
	{
		//calling
		InstCall t = new InstCall();
		t.m1();
	}

	//Instance Variable
	public void m1()
	{
		System.out.printf("\nEnter 1st Number: \n");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("Entered input is "+i +".");

		System.out.printf("\nEnter 2nd Number: \n");
		Scanner sd = new Scanner(System.in);
		int j = sd.nextInt();
		System.out.println("Entered input is "+j +".");

		System.out.printf("\nEnter 3rd Number: \n");
		Scanner se = new Scanner(System.in);
		int k = se.nextInt();
		System.out.println("Entered input is "+k +".");

		System.out.println();
		System.out.println();
		System.out.println();











	}
		
}
