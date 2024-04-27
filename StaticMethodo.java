//cube and area of a circle With the StaticMethodMethod

import java.util.Scanner;

class StaticMethodo
{
	public static void main(String[] args)
	{
		 m1();  // with Directly
		 System.out.println();
		
		 StaticMethodo.m1();  //With Class Name
		 System.out.println();

		 StaticMethodo t = new StaticMethodo(); // with Static
 		 t.m1();
	}

	public static void m1()
	{
		System.out.println("Enter a Radius Value: ");
		
		Scanner sc = new Scanner(System.in);
		double i = sc.nextDouble();
		double r=2*3.141*i;

		System.out.println("Perimeter of the circle: "+r);
		System.out.println();
		
	}

}