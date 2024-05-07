package javaByMKT;

interface sir{
	void accept();
	void reject();
}

interface mam extends sir{
	void correct();
	void wrong();	
}

public class Assignment15_InterfaceInterfaceConcreteClass implements mam {

	public static void main(String[] args) {
		
		Assignment15_InterfaceInterfaceConcreteClass iic = new Assignment15_InterfaceInterfaceConcreteClass();
		iic.accept();
		iic.correct();
		iic.reject();
		iic.wrong();
	}
	@Override
	public void accept() {
		System.out.println("accept method from sir interface");		
	}
	@Override
	public void reject() {
		System.out.println("reject method from sir interface");	
	}
	@Override
	public void correct() {
		System.out.println("correct method from mam interface");
	}
	@Override
	public void wrong() {
		System.out.println("wrong method from mam interface");
	}

}
