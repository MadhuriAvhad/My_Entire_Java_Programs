package javaByMKT;

class student {
	static void in() { System.out.println("in static method form student class");}
	
	void out() {System.out.println("out non static method form student class");}
}
abstract class MKT extends student {
	abstract void java();
	
	abstract void teacher();
	
	void learn() { System.out.println("learn non static method form MKT class");}
	
	static void speak() {System.out.println("speak static method form MKT class");}
}
public class Assignment14_ConcreteAndAbstractMethodsInAbstractClass extends MKT {
	void left() {System.out.println("left non static method from main class");}
	
	static void right() {System.out.println("right static method from main class");}
	
	public static void main(String[] args) {
		System.out.println("Execution starting from Main Block");
		Assignment14_ConcreteAndAbstractMethodsInAbstractClass a = new Assignment14_ConcreteAndAbstractMethodsInAbstractClass();
		in();
		a.out();
		a.java();
		a.teacher();
		a.learn();
		speak();
		a.left();
		right();
	}
	
	@Override
	void java() {System.out.println("java method from MKT class override in Main class");}
	
	@Override
	void teacher() {System.out.println("teacher method from MKT class override in Main class");}	
}
