package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		// Dropdown Handling 
		WebElement value = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop = new Select(value);

		// print the size of the dropdown code : Working as Expected 
		List<WebElement> web = drop.getOptions();
		int size = web.size();
		System.out.println(size);

		// To select the last value of the dropdown in application : Working as Expected 
		drop.selectByIndex(size-1);



		// Print all the values in the Dropdown : Working as Expected 
		for (WebElement ele : web) { 
			System.out.println(ele.getText());

		}


		// Print only the last value in the Dropdown : Working as Expected 
		int j = 0;
		for (WebElement ele : web) 
		{	
			if(j==size-1)
			{
				System.out.println("Last value = " + ele.getText()); 
				break;
			}
			j++;
		}
	}

}
