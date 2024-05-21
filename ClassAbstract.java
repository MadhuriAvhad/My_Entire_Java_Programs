package javaByMKT;

public class ClassAbstract extends SuperClass {
	
	static void loginWith_mobile()
	{
		System.out.println("From ClassAbstract");
	}

	public static void main(String[] args) {
		
		ClassAbstract subClass = new ClassAbstract();
		
		subClass.un_as_email();
		subClass.un_as_mobile();
		subClass.un_email();
		subClass.un_mobile();
		loginWith_mobile();
		subClass.login_button();
		subClass.registration_button();

	}

	@Override
	void un_as_email() {
		System.out.println("Override from SuperClass un_as_email()");	
	}

	@Override
	void un_as_mobile() {
		System.out.println("Override from SuperClass un_as_mobile()");	
	}

	@Override
	void un_email() {
		System.out.println("Override from SuperMostClass un_email()");	
	}

	@Override
	void un_mobile() {
		System.out.println("Override from SuperMostClass un_mobile()");
	}
	
}

abstract class SuperClass extends SuperMostClass
{
	abstract void un_as_email();
	abstract void un_as_mobile();	
	void registration_button()
	{
		System.out.println("From SuperClass");
	}
}

abstract class SuperMostClass
{
	abstract void un_email();
	abstract void un_mobile();
	void login_button()
	{
		System.out.println("From SuperMostClass");
	}
	
}
