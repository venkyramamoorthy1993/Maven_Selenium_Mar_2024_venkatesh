package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;	
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSampleXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// For sample I have taken all the types of xpaths in this page . 

		// Attribue based Xpath
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");

		// Index based Xpath
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[(@class='decorativeSubmit')]")).click();

		// Text based Xpath
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();

		// Partial Attirbuite Based Xpath
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("FRSH");

		driver.findElement(By.xpath("(//input[contains(@id,'firstName')])[1]")).sendKeys("VENKATESH");

		driver.findElement(By.xpath("(//input[contains(@id,'lastName')])[1]")).sendKeys("RAJA");

		// Dropdown Select Uses : 
		WebElement srcElement = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']")); 
		Select value = new Select(srcElement); 
		value.selectByIndex(6);

		// Without Select we able to use sendkeys
		// driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Word of Mouth");

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		System.out.println(driver.getTitle());

		Thread.sleep(5000);

		driver.close();
	}
}
