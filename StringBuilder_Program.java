package javaByMKT;

public class StringBuilder_Program {

	public static void main(String[] args) throws InterruptedException {

//		Base url of the website being tested
		String baseURL = "https://grotechminds.com/search";
		
//		Test data or parameters
		String searchQuery = "laptop";
		String sortBy = "price";
		String order = "ascending";
		
//		Use StringBuilder to construct the full URL
		StringBuilder urlBuild = new StringBuilder(baseURL);
		urlBuild.append("?query=");
		urlBuild.append(searchQuery);
		urlBuild.append("&sort=");
		urlBuild.append(sortBy);
		urlBuild.append("&order=");
		urlBuild.append(order);
		
//		Convert StringBuilder to String to be used in Selenium
		String fullURL = urlBuild.toString();
		
//		Output the URL (In practice, this would be where you navigate to the URL using Selenium)
		System.out.println("Constructed URL: " + fullURL);
		
//		Example Selenium usage (assuming WebDriver setup is done elsewhere)
//		WebDriver driver = new ChromeDriver();
//		driver.get(fullURL);
		

	}

}

