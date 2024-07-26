package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("Abc@1234.com");
		
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("Abc@1234");
		
		WebElement LoginBtn = driver.findElement(By.name("login"));
		LoginBtn.click();
		
		driver.close();
		
		
		
		
	}

}
