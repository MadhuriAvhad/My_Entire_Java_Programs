package javaByMKT;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Practice {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add(10);
		v.add("Jyoti");
		v.add(99.99);
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
