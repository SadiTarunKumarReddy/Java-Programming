				//By taking datatype print output

import java.util.*;
import java.util.Scanner;
import java.lang.StringIndexOutOfBoundsException;
import  java.util.InputMismatchException;

class DataType
{
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println();
try{
		//Byte
		System.out.println("-> Enter a Byte: ");
		Scanner ss = new Scanner(System.in);
		byte B = ss.nextByte();
		System.out.println("Solution is: "+B);
		
		System.out.println();
		System.out.println();

		System.out.println("-> Enter a short: ");
		Scanner sh = new Scanner(System.in);
		Short sho = sh.nextShort();
		System.out.println("Solution is: "+sho);

		System.out.println();
		System.out.println();


		System.out.println("-> Enter a integer: ");
		Scanner sc = new Scanner(System.in);
		int I = sc.nextInt();
		System.out.println("Solution is: "+I);

		System.out.println();
		System.out.println();
			

		System.out.println("-> Enter a long: ");
		Scanner l = new Scanner(System.in);
		long lo = l.nextLong();
		System.out.println("Solution is: "+lo);

		System.out.println();
		System.out.println();
			
		System.out.println("-> Enter a Boolean: ");
		Scanner b = new Scanner(System.in);
		boolean Bool = b.nextBoolean();
		System.out.println("Solution is: "+Bool);

		System.out.println();
		System.out.println();

		System.out.println("-> Enter a Float value: ");
		Scanner f = new Scanner(System.in);
		float floa = f.nextFloat();
		System.out.println("Solution is: "+floa);

		System.out.println();
		System.out.println();

		System.out.println("-> Enter a Double value: ");
		Scanner d = new Scanner(System.in);
		double doubl = d.nextDouble();
		System.out.println("Solution is: "+doubl);

		System.out.println();
		System.out.println();

		System.out.println("-> Enter a Character: ");
		Scanner ch = new Scanner(System.in);
		char c = ch.next().charAt(0);
		System.out.println("Solution is: "+c);

	}
		catch(Exception e)
		{
		System.out.println("ERROR=> "+e);
		}

		finally{
		System.out.println("GOOD NIGHT!");
		}	

	}
}