package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Button.html");
        driver.manage().window().maximize();
        driver.findElement(By.id("home")).click();
    WebElement getPosition=driver.findElement(By.id("position"));
    Point xypoint=getPosition.getLocation();
    int xValue=xypoint.getX();
    int yValue=xypoint.getY();
    System.out.println(+xValue+yValue);
    WebElement getColor=driver.findElement(By.id("color"));
    String color=getColor.getCssValue("background-color");
    System.out.println(color);
    WebElement sizeBox=driver.findElement(By.id("size"));
    int height=sizeBox.getSize().getHeight();
    int weight=sizeBox.getSize().getWidth();
    System.out.println(+height+weight);
   
    
	}

}
