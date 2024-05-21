package javaByMKT;

interface Interface1
{
	void login();
	void logout();
}

interface Interface2 extends Interface1
{
	void search();
	void payment();
}

public class ClassWithInterface implements Interface2 {

	void order_page()
	{
		
	}
	static void address_page()
	{
		
	}
	public static void main(String[] args) {
		
		ClassWithInterface ci = new ClassWithInterface();
		ci.login();
		ci.logout();
		ci.order_page();
		address_page();
		ci.search();
		ci.payment();

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		
	}

}
