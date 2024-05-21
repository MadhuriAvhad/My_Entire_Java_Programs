package javaByMKT;

public class AverageOfArrayValues {
	

	static int sum = 0;

	public static void main(String[] args) {

		int num[] = new int[5];
		num[0]=14;
		num[1]=34;
		num[2]=31;
		num[3]=22;
		num[4]=28;
		
		
		
		for(int i =0; i< num.length; i++)
		{
			sum = sum + num[i];
		}
		
		System.out.println(sum);
		System.out.println("Average of the Values present in array is "+(sum/num.length));
	}

}
