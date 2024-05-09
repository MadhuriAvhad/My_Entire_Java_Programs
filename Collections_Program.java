package javaByMKT;

import java.util.ArrayList;

public class Collections_Program {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("Ram");
		a.add(21);
		a.add('S');
		a.add(true);
		a.add(99.99);

		System.out.println("First Array "+a);
		
		ArrayList b = new ArrayList();
		b.addAll(a);
		b.add(2, "Sita");
		b.addAll(0, a);
		System.out.println("Second Array "+b);
	}

}
