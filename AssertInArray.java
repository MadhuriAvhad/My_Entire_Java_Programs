package javaByMKT;

public class AssertInArray {
	
	public static int sum =0;

	public static void main(String[] args) {
		
		int[] num = {10, 20, 30, 40, 50};
		
		for (int i = 0; i<num.length; i++)
		{
			sum = sum + num[i];
		}
		
		assert sum == 100;

	}

}
