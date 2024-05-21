package javaByMKT;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Program {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add("Ram");
		a.add(21);
		a.add('S');
		a.add(true);
		a.add(99.99);
		a.add(false);

		System.out.println(a);
		
		Iterator i = a.iterator();
		
		//hasNext(), next()
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
