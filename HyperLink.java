package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Link.html");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Go to Home Page")).click();
        driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
        driver.findElement(By.linkText("Verify am I broken?")).click();
        driver.findElement(By.linkText("Go to Home Page")).click();
        driver.findElement(By.linkText("How many links are available in this page?")).click();

	}

}
