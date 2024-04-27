import java.util.Scanner;

class StaticMethod
{
	public static void main(String[] args)
	{
		StaticMethod st = new StaticMethod();
		
		m1();  			//by direct
		st.m1();		 //by object
		StaticMethod.m1();	//by Class Name
		
	}

	public static void m1()
	{
		System.out.println("Enter a Radius Value: ");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		double r=2*3.141*i;

		System.out.println("Perimeter of the circle: "+r);
		System.out.println();
		
		
	}


}