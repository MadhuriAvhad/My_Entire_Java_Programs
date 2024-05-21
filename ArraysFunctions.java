package javaByMKT;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysFunctions {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the count of the students");
		int count = s.nextInt();
		
		String name[] = new String[count];
		int[] rollNo = new int[count];
		String[] gender = new String[count];
		
		for (int i = 0; i < count; i++)
		{
			System.out.println("Enter student "+(i+1)+" details as: name rollNo gender");
			name[i] = s.next();
			rollNo[i] = s.nextInt();
			gender[i] = s.next();
		}

		
			System.out.println("Student Name" + "    "+"Roll No" + "    "+"Gender");
		for (int i =0; i<name.length; i++)
		{
			System.out.println(name[i] +"             "+ rollNo[i] +"          "+gender[i]);
		}
		
		int[] rollNo1 = new int[count];
		System.out.println("Enter random rollNumbers");
		
		for (int i = 0; i < count; i++)
		{
			rollNo1[i] = s.nextInt();
		}
		
		
		if(Arrays.toString(rollNo1) == Arrays.toString(rollNo))
			System.out.println("Records are Matched");
		else
			System.out.println("Records are not Matched");
 

	}

}
