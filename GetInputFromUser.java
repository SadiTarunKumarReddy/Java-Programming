//                                                                Java Program to Get Input from the User




import java.util.Scanner;	//---------------->WORKING SCANNER IN JAVA

class GetInputFromUser	//----------------------------->DRIVER CLASS
{
	public static void main(String[] args)	//------------->MAIN FUNCTION
	{
		Scanner sc = new Scanner(System.in);	//---------------->CREAT SCANNER OBJECT
		
		String st = sc.nextLine();	//--------------------------------->READ STRING FROM SCREEN
		System.out.println("String is : "+st);	//------------------------->DISPLAY STRING

		int in = sc.nextInt();	//---------------------------------------------->READ INT
		System.out.println("Int is : "+in);	//------------------------------>DISPLAY INT

		Float fl = sc.nextFloat();	//------------------------------------------->READ FLOAT
		System.out.println("Float is : "+fl);	//----------------------------------->DISPLAY FLOAT
	}
}
