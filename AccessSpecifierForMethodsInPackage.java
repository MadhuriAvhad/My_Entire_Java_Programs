package javaByMKT;

public class AccessSpecifierForMethodsInPackage {

	public static void main(String[] args) {

		AccessSpecifierForMethodsInClass ap = new AccessSpecifierForMethodsInClass();
		
		ap.add();
		ap.mul();
		ap.div();
//		ap.sub(); sub method is private hence it is not visible to call

	}

}
