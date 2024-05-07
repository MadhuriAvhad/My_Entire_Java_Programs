package javaByMKT;

public class Assignment_FindingEachAreaOfCircleByUsingMATHRandomMethod {

	public static void main(String[] args) {

		for (int i =1; i<=10; i++)
		{
			double r = Math.random();
			System.out.println("Area of Circle "+i+": "+(Math.PI*r*r));
		}
	}

}
