package javaByMKT;

import java.util.Scanner;

public class ArithmaticOperationsByTakingHumanInput {
	
	void add(int a, int b)
	{
		System.out.println("void add("+a+", "+b+") o/p -> "+(a+b));
	}
	void sub(int a, int b)
	{
		System.out.println("void sub("+a+", "+b+") o/p -> "+(a-b));
	}
	void mul(int a, int b)
	{
		System.out.println("void mul("+a+", "+b+") o/p -> "+(a*b));
	}
	static void div(int a, int b)
	{
		System.out.println("static void div("+a+", "+b+") o/p -> "+(a/b));
	}
	static void mod(int a, int b)
	{
		System.out.println("static void mod("+a+", "+b+") o/p -> "+(a%b));
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write value for a : ");
		int a = sc.nextInt();
		System.out.println("Write value for b ");
		int b = sc.nextInt();
		
		ArithmaticOperationsByTakingHumanInput nsmethods = new ArithmaticOperationsByTakingHumanInput();
		
		nsmethods.add(a,b);
		nsmethods.sub(a,b);
		nsmethods.mul(a,b);
		div(a,b);
		mod(a,b);
		
		sc.close();
		
		

	}

}
