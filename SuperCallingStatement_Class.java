package javaByMKT;

class College
{
	College()
	{
		System.out.println("College");
	}
}

class School extends College
{
	School()
	{
		System.out.println("School");
	}
}

public class SuperCallingStatement_Class {

	public static void main(String[] args) {
		
		School s = new School();
		
	}

}
