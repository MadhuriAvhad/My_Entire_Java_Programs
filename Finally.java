package javaByMKT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("enter the Number of values to be in array");
			int i = sc.nextInt();
			String name[] = new String[i];
			name[0] = "Ram";
			name[1] = "Ram";
			name[2] = "Ram";
			name[3] = "Ram";
			System.out.println("try block is executed");
		}
		catch(InputMismatchException e1)
		{
			System.out.println("InputMismatchException Catch block is Executed");
		}
		catch(NullPointerException e1)
		{
			System.out.println("NullPointerException Catch block is Executed");
		}
		catch(IndexOutOfBoundsException e1)
		{
			System.out.println("IndexOutOfBoundsException Catch block is Executed");
		}

	}

}
