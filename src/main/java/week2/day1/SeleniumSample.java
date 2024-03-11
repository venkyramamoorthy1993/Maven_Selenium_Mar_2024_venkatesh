package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;	
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSample {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 driver.get("https://facebook.com"); Thread.sleep(5000);
		 driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		 driver.findElement(By.id("loginbutton")).click();
		 */

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FRSH");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("VENKATESH");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("RAJA");


		// Dropdown Select Uses : 
		WebElement srcElement = driver.findElement(By.id("createLeadForm_dataSourceId")); 
		Select value = new Select(srcElement); 
		value.selectByIndex(6);

		// Without Select we able to use sendkeys
		// driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Word of Mouth");


		driver.findElement(By.name("submitButton")).click();

		System.out.println(driver.getTitle());

		Thread.sleep(5000);

		driver.close();
	}
}
