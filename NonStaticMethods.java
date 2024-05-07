package javaByMKT;

public class NonStaticMethods {
	void add()
	{
		int a = 10;
		int b = 20;
		System.out.println("void add() "+(a+b));
	}
	void sub()
	{
		int a = 10;
		int b = 20;
		System.out.println("void sub() "+(a-b));
	}
	void mul()
	{
		int a = 10;
		int b = 20;
		System.out.println("void mul() "+(a*b));
	}
	void div()
	{
		int a = 10;
		int b = 20;
		System.out.println("void div() "+(a/b));
	}
	void mod()
	{
		int a = 10;
		int b = 20;
		System.out.println("void mod() "+(a%b));
	}
	public static void main(String[] args) {
		Assignment03_NonStaticMethods methods = new Assignment03_NonStaticMethods();
		methods.add();
		methods.sub();
		methods.mul();
		methods.div();
		methods.mod();
	}

}
