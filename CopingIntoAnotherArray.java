package javaByMKT;

import java.util.Arrays;

public class CopingIntoAnotherArray {

	public static void main(String[] args) {

		String[] org = new String[4];
		
		org[0] = "Ram";
		org[1] = "Sita";
		org[2] = "Laxman";
		org[3] = "Bharat";
		
		String[] copy = new String[org.length];
		
		for (int i =0; i<org.length; i++)
		{
			copy[i] = org[i];
		}
		
		System.out.println("Values present in org are " + Arrays.toString(org));
		System.out.println("Values present in copy are " + Arrays.toString(copy));

	}

}
