package javaByMKT;

public class Assignment10_AreaOfSurfaceCircumferenceUsingFinalVariable {
	
	final double pi = 3.14159;
	final static int r = 5;
	

	public static void main(String[] args) {
		
		Assignment10_AreaOfSurfaceCircumferenceUsingFinalVariable c = new Assignment10_AreaOfSurfaceCircumferenceUsingFinalVariable();
		
		System.out.println("Area of Circle for radius 5 : "+(c.pi*(r*r)));
		System.out.println("Circumference of Cirecle for radius 5 : "+(2*c.pi*r));
		

	}

}
