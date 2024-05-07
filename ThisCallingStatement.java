package javaByMKT;

public class ThisCallingStatement {
	
	ThisCallingStatement()
	{
		this('M');
		System.out.println("1");
	}
	
	ThisCallingStatement(char a)
	{
//		this(3.21);  ---> getting CTE as "Recursive constructor invocation ThisCallingStatement(double)"
		System.out.println("2");
	}
	
	ThisCallingStatement(double b)
	{
		this();
		System.out.println("3");
	}

	public static void main(String[] args) {
		new ThisCallingStatement(3.14);
		

	}

}
