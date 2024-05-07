package javaByMKT;

import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {


		Date d = new Date();
		System.out.println("Current Date and Time: "+d);
		
		String dt = d.toString();
		
//		Mon Apr 15 21:51:10 IST 2024
//		0123456789
		
		String date = dt.substring(8, 10);
		String month = dt.substring(4,7).concat("il");
		String year = dt.substring(24, dt.length());
		
		System.out.println("dd month yyyy -> " + date +" "+month+" "+year);
		System.out.println("dd-month-yyyy -> " + date +"-"+month+"-"+year);
		System.out.println("dd/month/yyyy -> " + date +"/"+month+"/"+year);
		
		System.out.println("-------------------------------------------------------");
		
		Date d2 = new Date(d.getTime());
		System.out.println(d.getTime() +" -> "+ d2);
		
		System.out.println("Get Future Date");
		
		Date d3 = new Date(d.getTime()+60*60*1000*24*6);
		System.out.println("Current Date is "+d+"\n and Future Date is "+d3);
		
		

	}

}
