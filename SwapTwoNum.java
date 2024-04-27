                                                                              //   Java Program to Swap Two Numbers




import java.util.Scanner;	//----------------------------->using Scanner

class SwapTwoNum	//------------------------------------------->class
{
	public static void main(String[] args)	//--------------------->Main
			
	{
		
		System.out.println("Enter Two Numbers: ");	//-------------->Request
		Scanner sc = new Scanner(System.in);	//---------------------->Scanner Creat

		int N1 = sc.nextInt();	//---------------------------------------->Read N1
		int N2 = sc.nextInt();	//---------------------------------------->Read N2
		

		System.out.println("Before Swapping: "+N1 +N2);	//------------------>Output Stmt
		
		int temp=N1;	//>
		N1=N2;		//----------------->Swapping Method
		N2=temp;	//>
		

		System.out.println("After Swapping: "+N1 +N2);	//--------->Output Stmt
	}
}