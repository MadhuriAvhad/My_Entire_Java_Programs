package javaByMKT;

public class ReplacingAllTheNumericValuesFromTheString {

	public static void main(String[] args) {
		
		String input = "School123";
		
		String output = input.replaceAll("[0-9]", "");
		
		System.out.println(output);

	}

}
