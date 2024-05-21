package javaByMKT;

public class AccessSpecifierForMethodsInClass {
	
	public void add()
	{
		System.out.println("public void add() from ASFMIC class");
	}
	
	private void sub()
	{
		System.out.println("private void sub() from ASFMIC class");
	}
	
	protected void mul()
	{
		System.out.println("protected void mul() from ASFMIC class");
	}
	
	void div()
	{
		System.out.println("void div() from ASFMIC class");
	}

/*	public static void main(String[] args) {
		
		AccessSpecifierForMethodsInClass ac = new AccessSpecifierForMethodsInClass();
		
		ac.add();
		ac.sub();
		ac.mul();
		ac.div();
	}
	
	It is working commented to use code in further programs
*/
}
