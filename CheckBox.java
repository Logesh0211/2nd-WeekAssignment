package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/checkbox.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[1]/input")).click();
         WebElement selSelected=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input"));
         boolean selenium=selSelected.isSelected();
         System.out.println(selenium);
         WebElement element2=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input"));
         if(element2.isSelected());
         element2.click();
         driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[1]/input")).click();
	}

}
