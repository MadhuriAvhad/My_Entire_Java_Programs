package javaByMKT;

public class Assignment13_OrderOfSIBMMIIBConstructor {
	
	Assignment13_OrderOfSIBMMIIBConstructor()
	{
		System.out.println("Started with the Constructor execution");
	}

	public static void main(String[] args) {
		
		System.out.println("Started with the Main Method execution");
		Assignment13_OrderOfSIBMMIIBConstructor order = new Assignment13_OrderOfSIBMMIIBConstructor();
	}
	
	{
		System.out.println("Started with the Instance Initialization Block execution");
	}
	
	static
	{
		System.out.println("Started with the Static Initialization Block execution");
	}

}
