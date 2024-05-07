package javaByMKT;

public class PrintingNameReverseInHorizontalManner {

	public static void main(String[] args) {


		String name ="Madhuri";
		System.out.println("Printing name Madhuri in reverse");
		for (int i =name.length()-1; i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}

		String empty = "";
		System.out.println();
		System.out.println(name.isEmpty());
		System.out.println(empty.isEmpty());
	}

}
