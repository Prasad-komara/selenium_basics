package day2;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatotors {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
		
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		
		//boolean logoDisplayed=driver.findElement(By.id("logo")).isDisplayed(); 
		//System.out.println(logoDisplayed);
		
		
		//linktest  and partial linktest
		
		// driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Tab")).click();
		
		
		//class
		
		
		//List <WebElement>  headerLinks=  driver.findElements(By.className("list-inline-item"));
	   	 //System.out.println( headerLinks.size());
		
		//Tagname
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		  System.out.println( links.size());
		  
		  
		  //images
		  
		  List<WebElement> images=driver.findElements(By.tagName("img"));
			
		  System.out.println( images.size());
		
		
		
	}

}
