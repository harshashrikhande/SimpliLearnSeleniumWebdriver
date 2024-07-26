package testng;

import org.testng.annotations.Test;

public class OneTCExample extends BaseClass{

	@Test(groups = {"regression", "sanity"})
	public void TestCase_01() {
		System.out.println("Inside TC01");
		
	}
}
