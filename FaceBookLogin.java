package week2day2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
        driver.findElement(By.name("firstname")).sendKeys("Logesh");
        driver.findElement(By.name("lastname")).sendKeys("R");
        driver.findElement(By.name("reg_email__")).sendKeys("logesh.cse43@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("logeshcsea");
        WebElement elementDropdown = driver.findElement(By.name("birthday_day"));
		Select dd=new Select(elementDropdown);
		dd.selectByVisibleText("7");
		WebElement elementDropdown1 = driver.findElement(By.name("birthday_month"));
		Select dd1=new Select(elementDropdown1);
		dd1.selectByValue("11");
		WebElement elementDropdown2 = driver.findElement(By.name("birthday_year"));
		Select dd2=new Select(elementDropdown2);
		dd2.selectByVisibleText("1995");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		}
}


