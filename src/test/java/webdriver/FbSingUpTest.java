package webdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSingUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement SignUp = driver.findElement(By.partialLinkText("Create new"));
		SignUp.click();

		WebElement day = driver.findElement(By.id("day"));
		Select ddDay = new Select(day);
		ddDay.selectByVisibleText("30");

		WebElement month = driver.findElement(By.id("month"));
		Select ddMonth = new Select(month);
		ddMonth.selectByVisibleText("Jun");

		WebElement year = driver.findElement(By.id("year"));
		Select ddYear = new Select(year);
		ddYear.selectByVisibleText("1985");

		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();

		// Print all the months values from month dropdown
		List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']/option"));

		 System.out.println("First month is " + months.get(0).getText());
		 System.out.println("Second month is " + months.get(1).getText());

		for (WebElement m : months) {
			System.out.println(m.getText());
		}
		
		
		//Find total number of links on the page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total number of links are " + links.size());

	}

}
