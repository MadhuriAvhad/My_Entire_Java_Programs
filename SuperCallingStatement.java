package javaByMKT;

public class SuperCallingStatement extends SuperClassCalling {
	

	SuperCallingStatement()
	{
		System.out.println("Super Calling Statement non parameterized construction");
	}
	public static void main(String[] args) {

		new SuperCallingStatement();
		new SuperCallingStatement(100);

	}
	SuperCallingStatement(int a)
	{
		super(10,20);
		System.out.println("Super Calling Statement 1 parameterized construction");
	}

}

class SuperClassCalling extends SuperMostClassCalling
{
	SuperClassCalling()
	{
		System.out.println("Super Class Calling non parameterized construction");
	}
	SuperClassCalling(int a, int b)
	{
		super(10,20,30);
		System.out.println("Super Class Calling 2 parameterized construction");
	}
}

class SuperMostClassCalling
{
	SuperMostClassCalling()
	{
		System.out.println("Super Most Class Calling non parameterized construction");
	}
	SuperMostClassCalling(int a, int b, int c)
	{
		System.out.println("Super Most Class Calling 3 parameterized construction");
	}
}


