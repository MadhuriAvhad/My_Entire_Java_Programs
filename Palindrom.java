package javaByMKT;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a value to check the Palindrom");
		String name = sc.next();
		String reverse ="";

		
	    for(int i = name.length()-1; i>=0; i--)
	    {
	    	char rev = name.charAt(i);
	    	
	    	reverse = reverse + rev;
	    }
	    
	    System.out.println("Input Value - " + name);
	    System.out.println("Output after reverse - " + reverse);
	    
	    if(name.equals(reverse))
	    {
	    	System.out.println("\"It is a Palindrom\"");
	    }
	    
	    else
	    	System.out.println("\"It is not a Palindrom\"");
	    
	    sc.close();

	}

}
