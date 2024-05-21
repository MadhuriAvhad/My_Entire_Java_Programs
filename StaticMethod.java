package javaByMKT;

public class StaticMethod {
	 
	static void add()
	{
		int a = 10;
		int b = 20;
		System.out.println("static void add() "+(a+b));
	}
	static void sub()
	{
		int a = 10;
		int b = 20;
		System.out.println("static void sub() "+(a-b));
	}
	static void mul()
	{
		int a = 10;
		int b = 20;
		System.out.println("static void mul() "+(a*b));
	}
	static void div()
	{
		int a = 10;
		int b = 20;
		System.out.println("static void div() "+(a/b));
	}
	static void mod()
	{
		int a = 10;
		int b = 20;
		System.out.println("static void mod() "+(a%b));
	}
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();
	}

}
