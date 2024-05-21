package javaByMKT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ListAndSet_Program {

	public static void main(String[] args) {

		System.out.println("Understanding on List"); 
		List l = new ArrayList();
		l.add("Pen");
		l.add("Pencil");
		l.add("Box");
		l.add("Bottle");
		l.add("Table");
		l.add("Pencil");
		l.add(null);
		l.add(null);
		System.out.println(l);
		
		ListIterator li = l.listIterator();
		while (li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("-----------------------------------------------------");
		while (li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		/*
		 * Folllows indexing
		 * Follows order of insertion
		 * Accept repeatative values
		 * Accept null values
		 * Accept multiple null values
		 */

		System.out.println("Understanding on Set"); 
		Set s = new HashSet();
		s.add("Pen");
		s.add("Pencil");
		s.add("Box");
		s.add("Bottle");
		s.add("Table");
		s.add("Pencil");
		s.add(null);
//		s.add(null);
		System.out.println(s);
		
		/*
		 * Not followed indexing rather they follow hash code value
		 * Do not follow order of insertion
		 * Do not accept repeatative values
		 * Do not accept null value
		 * Do not allow multiple null only write one null value
		 */
	}

}
