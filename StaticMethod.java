//cube and area of a circle With the StaticMethodMethod

import java.util.Scanner;

class StaticMethod
{
	public static void main(String[] args)
	{
		 m1();  // with Directly
		 System.out.println();
		
		 StaticMethod.m1();  //With Class Name
		 System.out.println();

		 StaticMethod t = new StaticMethod(); // with Static
 		 t.m1();
	}

	public static void m1()
	{
		System.out.printf("Enter a Value: \n");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int y = x*x*x;
		double z = 3.141*x*x;
		
		System.out.printf("Cube of the Entered Number is: %d\n",y);
		System.out.println("Area of the Circle is: "+z);
		System.out.println();
		System.out.println();
		
	}

}