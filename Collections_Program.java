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
		a.add(false);
		
		System.out.println("First Array "+a+" -> Origional ArrayList");
		a.remove(0); // remove by index
		System.out.println("First Array "+a+" -> ArrayList after a.remove(0)");
		a.remove(false); // remove by object
		System.out.println("First Array "+a+" -> ArrayList after a.remove(false)");
		System.out.println("First Array -> " + a.contains("Sita")+" -> Is ArrayList contains \"Sita\" a.contains(\"Sita\") " );
		/*a.clear(); // clear
		System.out.println("First Array "+a+" -> ArrayList after a.clear()");
		System.out.println("First Array -> Is ArrayList Empty a.isEmpty() -> " + a.isEmpty());*/
		
		ArrayList b = new ArrayList();
		b.addAll(a); // add all by object
		System.out.println("Second Array "+b+" -> Duplicate ArrayList of a");
		b.add(2, "Sita"); // add by index and object
		System.out.println("Second Array "+b+" -> ArrayList after b.add(2, \"Sita\"");
		b.addAll(0, a); // add all by index and object
		System.out.println("Second Array "+b+" -> ArrayList after b.addAll(0, a)");
		/*b.removeAll(a); // remove all
		System.out.println("Second Array "+b+" -> ArrayList after b.removeAll(a)");*/
		
		ArrayList c = new ArrayList();
		c = (ArrayList) b.clone();
		System.out.println("Third Array "+c+" -> ArrayList Clone from Second ArrayList");
		
				
	}

}
