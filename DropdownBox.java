package week2day2;

import java.util.List;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.detDSA224;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Dropdown.html");
        driver.manage().window().maximize();
        WebElement dropDown1=driver.findElement(By.id("dropdown1"));
        Select dd1=new Select(dropDown1);
        dd1.selectByIndex(2);
       WebElement dropDown2=driver.findElement(By.name("dropdown2"));
       Select dd2=new Select(dropDown2);
       dd2.selectByVisibleText("Loadrunner");
       WebElement dropDown3=driver.findElement(By.id("dropdown3"));
       Select dd3=new Select(dropDown3);
       dd3.selectByValue("3");
       WebElement options=driver.findElement(By.className("dropdown"));
       Select dd4=new Select(options);
       List<WebElement> multipleOptions=dd4.getOptions();
       int size=multipleOptions.size();
       System.out.println(size);
       WebElement sendKeysTab=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
       sendKeysTab.sendKeys("UFT/QTP");
       WebElement selectProgram=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
       Select dd5=new Select(selectProgram);
       dd5.selectByValue("1");
       dd5.selectByValue("3");
       
       
       
       
       
    		   
    		   
        
	}

}
