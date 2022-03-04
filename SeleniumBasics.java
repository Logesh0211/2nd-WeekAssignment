package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafLife");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Logesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Raj");
		driver.findElement(By.name("departmentName")).sendKeys("Cse");
		driver.findElement(By.name("description")).sendKeys("Selenium Basics Course");
		driver.findElement(By.name("primaryEmail")).sendKeys("logesh.cse43@gmail.com");
		WebElement elementDropdown = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd=new Select(elementDropdown);
		dd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		System.out.println("The title is"+leafTree);
		
		
		
		


	}

}
