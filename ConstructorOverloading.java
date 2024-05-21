package javaByMKT;

public class ConstructorOverloading {
	
	ConstructorOverloading()
	{
		System.out.println("Calling from non parameterized construction");
	}

	ConstructorOverloading(int a, int b, int c)
	{
		System.out.println("Calling from three parameterized construction " +(a+b+c));
	}
	
	ConstructorOverloading(int a, boolean b, char c, double d, int e, long i, float j)
	{
		System.out.println("Calling from seven parameterized construction " +a+" "+e+" "+i+" "+j+" "+d+" "+b+" "+c);
	}

	public static void main(String[] args) {
		
		ConstructorOverloading co = new ConstructorOverloading();
		
		new ConstructorOverloading(10, false, 'M', 12.5, 20, 30, 40.5f);
		new ConstructorOverloading(5, 20, 10);
		
	}

}
