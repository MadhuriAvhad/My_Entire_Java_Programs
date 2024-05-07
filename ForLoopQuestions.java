package javaByMKT;

public class ForLoopQuestions {

	public static void main(String[] args) {

		System.out.println("Q1. Print 100 to 0.");
		for (int i = 100; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println();
		System.out.println("Q2. Print -50 to -30.");
		for (int i = -50; i <= -30; i++) {
			;
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println();
		System.out.println("Q3. Print -10 to 10.");
		for (int i = -10; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println();
		System.out.println("Q4. Print Even and Odd Number Using For and If Else Loop.");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is Even Number");
			}
			else
				System.out.println(i + " is Odd Number");
		}
	}
}
