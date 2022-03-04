package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Edit.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("logesh.cse43@gmail.com");
        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input")).sendKeys("Leaf");
        driver.findElement(By.name("username")).getAttribute("TestLeaf");
        driver.findElement(By.name("username")).clear();
        WebElement disabled=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
        boolean enabled=disabled.isEnabled();
        System.out.println(enabled);

	}

}
