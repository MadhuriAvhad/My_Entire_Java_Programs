package javaByMKT;

public class AssertFunction {
	
	static void add(int a, int b)
	{
		assert a ==100;
		
		System.out.println(a+b);
	
	}

	public static void main(String[] args) {
		
		String name = "Siya";
		
		assert name.length()>0 : "String does not have any value";
		
		System.out.println(name.concat(" Ram"));
		
		add(11,200);

	}

}
