//                                            Java Program to Multiply Two Floating-Point Numbers







import java.util.Scanner;	//------------------------------->Using Scanner

class MulTwoFloatNum	//------------------------------------------->Class
{
	public static void main(String[] args)	//---------------------->Main
	{
	System.out.println("Enter Two Floating Point Number: ");	//------>Take Input
	Scanner sc = new Scanner(System.in);	//------------------------------>Create Scanner
	
	Float fl1 = sc.nextFloat();	//-------------------------------------------->Read First Input
	Float fl2 = sc.nextFloat();	//-------------------------------------------->Read Second Input
	
	Float Multiply = fl1*fl2;	//-------------------------------------------------->Operation
	
	System.out.println("MUL is: " +Multiply);	//-------------------------------------->Dispay Output
	}
}
