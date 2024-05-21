package javaByMKT;

public class TravellingCostDiffMFC 
{
	public static void main(String[] args) 
	{
		char gender = 'F';
		
		if(gender == 'M')
		{
			System.out.println("Travelling cost for male to travel from A to B is 20rs.");
		}
		else if (gender =='F')
		{
			System.out.println("Travelling cost for female to travel from A to B is 10rs.");
		}
		else
		{
			System.out.println("Travelling cost for custom to travel from A to B is 5rs.");
		}
	}
}
