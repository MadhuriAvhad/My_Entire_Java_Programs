package javaByMKT;

public class AverageOfTwoArraysValuesIntAndDoubleDatatype {
	
	static double sum =0;

	public static void main(String[] args) {

		int[] arr1 = new int[4];
		
		double[] arr2 = new double[4];
		
		arr1[0] = 75;
		arr1[1] = 87;
		arr1[2] = 98;
		arr1[3] = 56;
		
		arr2[0] = 13;
		arr2[1] = 24;
		arr2[2] = 32;
		arr2[3] = 41;
		
		for(int i = 0; i<arr1.length;i++)
		{
			sum = sum + arr1[i] + arr2[i];
		}
		
		System.out.println("Sum of the total values present in bothe the arrays is "+sum);
		System.out.println("Average of the values present in bothe the arrays is "+(sum/arr1.length));
		System.out.println("Remainders of the values present in bothe the arrays is "+(sum%arr1.length));

	}

}
