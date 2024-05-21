package javaByMKT;

public class AddSubMulDivModUsingGlobalVariable {
	
	static int a = 20;
	static int b = 30;
	int c = 40;

	void add()
	{
		System.out.println("void add() "+(a+c));
	}
	void sub()
	{
		System.out.println("void sub() "+(a-c));
	}
	void mul()
	{
		System.out.println("void mul() "+(a*b));
	}
	static void div()
	{
		System.out.println("static void div() "+(a/b));
	}
	static void mod()
	{
		System.out.println("static void mod() "+(a%b));
	}
	public static void main(String[] args) {
		AddSubMulDivModUsingGlobalVariable nsmethods = new AddSubMulDivModUsingGlobalVariable();
		nsmethods.add();
		nsmethods.sub();
		nsmethods.mul();
		div();
		mod();
	}

}
