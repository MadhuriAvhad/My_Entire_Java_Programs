package javaByMKT;

public class StaticNonStaticMethods {
	
	static void smethod()
	{
		System.out.println("Called from - static void smethod()");
	}
	
	void nsmethod()
	{
		System.out.println("Called from - void nsmethod()");
	}

	public static void main(String[] args) {
		StaticNonStaticMethods method = new StaticNonStaticMethods();
		method.nsmethod();
		smethod();
	}

}
