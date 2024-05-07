package javaByMKT;

import java.util.Scanner;

public class Assignment12_DeclareUtilizeStaticMethodsScannerClass {
	
	static short sh;
	static byte by;
	static int i;
	static long l;
	static float f;
	static double d;
	static boolean bo;
	static String st;

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the values as per the below sequence"
				+ ""
				+ "\nbyte"
				+ "\nshort"
				+ "\nint"
				+ "\nlong"
				+ "\nfloat"
				+ "\ndouble"
				+ "\nboolean"
				+ "\nnext");
		by = s.nextByte();
		System.out.println("Input value stored for Byte is " +by);
		sh = s.nextShort();
		System.out.println("Input value stored for Short is " +sh);		
		i = s.nextInt();
		System.out.println("Input value stored for Int is " +i);
		l =s.nextLong();
		System.out.println("Input value stored for Long is " +l);
		f=s.nextFloat();
		System.out.println("Input value stored for Float is " +f);
		d=s.nextDouble();
		System.out.println("Input value stored for Double is " +d);
		bo=s.nextBoolean();
		System.out.println("Input value stored for Boolean is " +bo);
		st=s.next();
		System.out.println("Input value stored for String is " +st);

	}

}