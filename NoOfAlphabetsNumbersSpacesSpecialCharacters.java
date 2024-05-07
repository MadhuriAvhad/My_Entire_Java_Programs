package javaByMKT;

import java.util.Arrays;

public class NoOfAlphabetsNumbersSpacesSpecialCharacters {
	
	static String name = "Madhuri @!22&28!@ Kailas Avhad";
	
	static int alphaCount;
	static int numericCount;
	static int spaceCount;
	static int specialCharCount;
	
	static int totalCount = name.length();

	static char[] c = name.toCharArray();
	
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(c));
		System.out.println();
		countOfAlpha();
		countOfNumeric();
		countOfSpace();
		countOfSpecialChar();
	}
	
	static void countOfAlpha()
	{
		for (int i =0; i< c.length; i++)
		{
			boolean alpha = Character.isAlphabetic(c[i]);
			if(alpha == true)
			{
				alphaCount++;
			}	
		}
		
		System.out.println("Total Count of Alphabets are " + alphaCount);
		
	}
	
	static void countOfNumeric()
	{
		for (int i =0; i< c.length; i++)
		{
			boolean number = Character.isDigit(c[i]);
			if(number == true)
			{
				numericCount++;
			}			
		}
		
		System.out.println("Total Count of Numeric values are " + numericCount);
	}
	
	static void countOfSpace()
	{
		for (int i =0; i< c.length; i++)
		{
			boolean space = Character.isSpaceChar(c[i]);
			if(space == true)
			{
				spaceCount++;
			}			
		}
		
		System.out.println("Total Count of Spaces are " + spaceCount);
	}
	
	static void countOfSpecialChar()
	{
		specialCharCount = totalCount - alphaCount - numericCount - spaceCount;
		
		System.out.println("Total Count of Special Characters are " + specialCharCount);
	}
}
