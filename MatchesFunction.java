package javaByMKT;

import java.util.Arrays;

public class MatchesFunction {

	public static void main(String[] args) {
		
		String input = "Madhuri";
		
		System.out.println(input.matches("M(.*)"));
		System.out.println(input.matches("(.*)H"));
		System.out.println(input.matches("-------"));
		
		System.out.println(input.lastIndexOf('h'));
		
		System.out.println(input.repeat(5));
		
		String arr[] = input.split("h");
		
		System.out.println(Arrays.toString(arr));
	

	}

}
