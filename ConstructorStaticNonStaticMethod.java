package javaByMKT;

public class ConstructorStaticNonStaticMethod {
	
	void add()
	{
		int a = 100;
		int b = 200;
		System.out.println("Non Static add "+(a+b));
	}
	
	ConstructorStaticNonStaticMethod(int a)
	{
		a = 100;
		int b = 200;
		System.out.println("Single Parameterized Constructor sub "+(a-b));
	}
	
	static void mul()
	{
		int a = 100;
		int b = 200;
		System.out.println("Static mul "+(a*b));
	}
	
	ConstructorStaticNonStaticMethod(int c, int d)
	{
		int a = 100;
		int b = 200;
		System.out.println("Multiple Parameterized Constructor div "+(a/b));
	}
	
	ConstructorStaticNonStaticMethod()
	{
		int a = 100;
		int b = 200;
		System.out.println("Non Parameterized Constructor mod"+(a%b));
	}
	
	public static void main(String[] args) {
		
		ConstructorStaticNonStaticMethod s1 = new ConstructorStaticNonStaticMethod();
		s1.add();
		mul();
		new ConstructorStaticNonStaticMethod(400);
		new ConstructorStaticNonStaticMethod(100,200);
		
	}

}
