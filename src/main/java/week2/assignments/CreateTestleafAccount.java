package week2.assignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateTestleafAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[(@class='decorativeSubmit')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();


		// Need to give random account name
		String accountName = "Venkatesh Account ran";

		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys(accountName);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");

		WebElement drop1 = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industry = new Select(drop1);
		industry.selectByValue("IND_SOFTWARE");

		WebElement drop2 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownership = new Select(drop2);
		ownership.selectByVisibleText("S-Corporation");

		WebElement drop3 = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select source = new Select(drop3);
		source.selectByValue("LEAD_EMPLOYEE");

		WebElement drop4 = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select marketingCampaign = new Select(drop4);
		marketingCampaign.selectByIndex(6);

		driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']")).sendKeys("Texas");
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();

		String output = driver.findElement(By.xpath("(//span[contains(text(),'Account Name')]//following::span)[1]")).getText();

		if (output.contains(accountName))
		{
			System.out.println("Account Name is correct");
		}
		else {
			System.out.println("Account Name is false");
		}
		
		Thread.sleep(5000);

		driver.quit();
	}

}
