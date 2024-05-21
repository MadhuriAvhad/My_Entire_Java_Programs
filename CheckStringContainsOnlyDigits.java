package javaByMKT;

public class CheckStringContainsOnlyDigits {

	static int count = 0;
	public static void main(String[] args) {


		String input = "0123456789";
		
		char[] nums = input.toCharArray();
		
		for (int i = 0; i< nums.length; i++)
		{
			boolean flag = Character.isDigit(nums[i]);
			
			if(flag == true)
			{
				count++;
			}
		}
		
		if(nums.length == count)
		{
			System.out.println("String contains only digits");
		}
		else
		System.out.println("String does not have only digits");

	}

}
