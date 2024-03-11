package week2.assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccountChecking {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://en-gb.facebook.com");
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Venkatesh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raja");
		
		driver.findElement(By.xpath("(//div[contains(text(),'Mobile number or email address')]/following::input)[1]")).sendKeys("9344897301");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("MyPassword");
		
		WebElement drop1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select day = new Select(drop1);
		day.selectByIndex(28);
		
		WebElement drop2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select month = new Select(drop2);
		month.selectByValue("12");
		
		WebElement drop3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select year = new Select(drop3);
		year.selectByVisibleText("1993");
		
		driver.findElement(By.xpath("(//label[text()='Male']/following::input[@type='radio'])[1]")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
