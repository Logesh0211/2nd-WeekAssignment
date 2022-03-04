package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Image.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img")).click();
        driver.navigate().back();
        WebElement amBroken=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div"));
        if(amBroken.getAttribute("naturalWidth").equals("0"))
        {
        	System.out.println("The image is Borken");
        }
        
        else{
         	System.out.println("The image is not Broken");
        }
        
        WebElement keyboardOrMouse=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/label"));
        keyboardOrMouse.click();
        
        

	}

}
