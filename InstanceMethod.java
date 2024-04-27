//cube and area of a circle With the InstanceMethod

import java.util.Scanner;

class InstanceMethod
{
	public static void main(String[] args)
	{
		 InstanceMethod t = new InstanceMethod();
 		 t.m1();
	}

	public void m1()
	{
		System.out.printf("Enter a Value: \n");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int y = x*x*x;
		double z = 3.141*x*x;
		
		System.out.printf("Cube of the Entered Number is: %d\n",y);
		System.out.println("Area of the Circle is: "+z);
		
	}

}