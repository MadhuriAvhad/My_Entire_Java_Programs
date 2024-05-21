package javaByMKT;

public class StringBuffer_Program {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Automation");
		sb = sb.append(" Testing");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
//		If(sb.ensureCapacity(5))
//		{
//			
//		}
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		String s = "Manual";
		s=s.concat(" Testing");
		System.out.println(s);
		

	}

}
