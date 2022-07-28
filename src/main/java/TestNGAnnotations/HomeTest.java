package TestNGAnnotations;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestNGAnnotations.MyListenerTest.class)
public class HomeTest extends BaseTest {
	
	
	@Test
	public void header() {
		System.out.println("Header test");
	}
	
	

}
