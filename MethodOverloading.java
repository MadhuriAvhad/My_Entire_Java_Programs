package javaByMKT;

public class MethodOverloading {
	
	void add()
	{
		System.out.println("void add()");
	}
	
	void add(int a)
	{
		System.out.println("void add(int a) "+(a));
	}
	
	static void add(double a, int b)
	{
		System.out.println("static void add(double a, int b) "+(a+b));
	}
	
	void add(int a, int b, int c, int d)
	{
		a=11;
		System.out.println("void add(int a, int b, int c, int d) "+(a+b+c+d));
	}

	public static void main(String[] args) {
		
		add(12.5, 6);
		MethodOverloading m = new MethodOverloading();
		m.add();
		m.add(8);
		m.add(1, 2, 3, 4);
		

	}

}
