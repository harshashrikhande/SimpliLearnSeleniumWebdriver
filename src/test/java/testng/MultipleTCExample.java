package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTCExample extends BaseClass{
	
	@Test(priority = 1)
	public void TC_02() {
		System.out.println("Inside TC 02");
	}
	@Test(priority = 2)
	public void TC_07() {
		System.out.println("Inside TC 07");
	}
	
	@Test(priority = 0, groups = {"regression"})
	public void TC_04() {
		System.out.println("Inside TC 04");
	}
	
	@Test(enabled = true, priority = 0)
	public void TC_01() {
		System.out.println("Inside TC 03");
	}
	
	@Test
	public void TC_05() {
		System.out.println("Inside TC 05");
	}
	
	@Test
	public void TC_06() {
		System.out.println("Inside TC 06");
	}
}
