package javaByMKT;

import java.util.Arrays;

public class Anagram {
//	Angel = Angle
	public static void main(String[] args) {
		
		String w1 = "ANGEL";
		String w2 = "ANGLE";
		
		if(w1.length() != w2.length())
		{
			System.out.println(w1+" and "+ w2+"  are NOT Anagram");
		}
		
		char[] c1 = w1.toCharArray();
		char[] c2 = w2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2))
		{
			System.out.println(w1+" and "+ w2+" are Anagram");
		}
		else
			System.out.println(w1+" and "+ w2+"  are NOT Anagram");

	}

}
