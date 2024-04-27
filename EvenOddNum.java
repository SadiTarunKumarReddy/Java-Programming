			//Even and Odd Checking by java program


import java.util.Scanner;

class EvenOddNum
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number:- ");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i%2==0)
		{	
			System.out.printf("Entered Number %d is Even.\n",i );
		}
		else
		{
			System.out.println("Entered Number is "+i+" Odd.");
		}

		
	}
}