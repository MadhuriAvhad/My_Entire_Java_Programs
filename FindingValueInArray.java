package javaByMKT;

import java.util.Scanner;

public class FindingValueInArray {

	public static void main(String[] args) {
		
		int nos[] = {90, 41, 60, 41, 90, 41};
		
		int count =0;
		String presence = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check in Array");
		int givenNo = sc.nextInt();
		
		for (int i=0; i<nos.length; i++)
		{
			if (nos[i] == givenNo)
			{
				presence = " is present in Array";
				count++;
			}
		}
		
		System.out.println(givenNo + " is present "+count + " times in an Array");

	}

}
