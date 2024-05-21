package javaByMKT;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Program {

	public static void main(String[] args) {


		ArrayList a = new ArrayList();
		a.add(15);
		a.add(76);
		a.add(76);
		a.add(99);
		a.add(23);
		a.add(165);
		
		System.out.println("Normal String -> "+a);
		Collections.sort(a);
		System.out.println("Sorted String -> "+a);
		
		ArrayList s = new ArrayList();
		
		s.add("Avhad Madhuri");
		s.add("Avhad Kajal");
		s.add("Avhad Sangita");
		s.add("Avhad Kailas");
		
		System.out.println("Normal String -> "+s);
		Collections.sort(s);
		System.out.println("Sorted String -> " +s);
	}

}
