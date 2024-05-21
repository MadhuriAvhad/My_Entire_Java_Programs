package javaByMKT;

public class OrderOfSIBMMIIBConstructor {
	
	OrderOfSIBMMIIBConstructor()
	{
		System.out.println("Started with the Constructor execution");
	}

	public static void main(String[] args) {
		
		System.out.println("Started with the Main Method execution");
		OrderOfSIBMMIIBConstructor order = new OrderOfSIBMMIIBConstructor();
	}
	
	{
		System.out.println("Started with the Instance Initialization Block execution");
	}
	
	static
	{
		System.out.println("Started with the Static Initialization Block execution");
	}

}
