//                                                                         Java Program to Read The Number From Standard Input





import java.util.Scanner;	//--------------------------------------------------------->JAVA PROGRAM TO TAKE INPUT INTEGER

class PrintNum	//-------------------------------------------------------------------------->DRIVER CLASS
{	
	public static void main(String[] args)	//------------------------------------------->MAIN FUNCTION
		{
			int num;	//-------------------------------------------------->VARIABLE DECLARATION
			System.out.println("Enter a number for print: ");	//---------->INPUT INTEGER

			Scanner se = new Scanner(System.in);	//----------------------------->CREAT SCANNER OBJECT
			num = se.nextInt();	//--------------------------------------------->READ INPUT OBJECT FROM SCANNNER

			System.out.println("Entered number is: "+num);	//---------------------->DISPLAY OUTPUT
		}
}