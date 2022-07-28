package TestNGAnnotations;

import org.testng.annotations.Test;

public class DependsOnandPriority {
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void login() {
		System.out.println("Login");
		int i=9/0;
		System.out.println("ABC"); //This will not be printed as on previous step there is exception being thrown. 
	}
	@Test(dependsOnMethods ="login")
	public void HomePage() {
		System.out.println("HomePage");
	}
	@Test(dependsOnMethods ="login")
	public void Search() {
		System.out.println("Search");
	}
	
	

}
