package javaByMKT;

public class Encapsulation {

	public static void main(String[] args) {
		
		Amazon_App a = new Amazon_App();
		
		System.out.println(a.getName());
		a.setName("Chetan");
		System.out.println(a.getName());
		System.out.println(a.getAge());
		a.setAge(25);
		System.out.println(a.getAge());
	}

}

class Amazon_App
{
	private String name = "Madhuri Avhad";
	private int age = 21;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
}