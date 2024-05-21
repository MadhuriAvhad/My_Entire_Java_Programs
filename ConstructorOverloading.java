package javaByMKT;

public class ConstructorOverloading {
	
	Assignment05_ConstructorOverloading()
	{
		System.out.println("Calling from non parameterized construction");
	}

	Assignment05_ConstructorOverloading(int a, int b, int c)
	{
		System.out.println("Calling from three parameterized construction " +(a+b+c));
	}
	
	Assignment05_ConstructorOverloading(int a, boolean b, char c, double d, int e, long i, float j)
	{
		System.out.println("Calling from seven parameterized construction " +a+" "+e+" "+i+" "+j+" "+d+" "+b+" "+c);
	}

	public static void main(String[] args) {
		
		Assignment05_ConstructorOverloading co = new Assignment05_ConstructorOverloading();
		
		new Assignment05_ConstructorOverloading(10, false, 'M', 12.5, 20, 30, 40.5f);
		new Assignment05_ConstructorOverloading(5, 20, 10);
		
	}

}
