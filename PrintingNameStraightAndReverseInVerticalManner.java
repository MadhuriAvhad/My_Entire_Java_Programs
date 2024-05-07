package javaByMKT;

public class PrintingNameStraightAndReverseInVerticalManner {

	public static void main(String[] args) {

		String name ="Madhuri";
		System.out.println("Printing name Madhuri in straight");
		for (int i =0; i<name.length();i++)
		{
			System.out.println(name.charAt(i));
		}
		
		reverseName(name);

	}
	
	static void reverseName(String name)
	{
		System.out.println("--------------------------------------");
		System.out.println("Printing name Madhuri in reverse");
		for (int i =name.length()-1; i>=0;i--)
		{
			System.out.println(name.charAt(i));
		}
	}

}
