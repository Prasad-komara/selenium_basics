package day2;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
	   
		// total number of links
	List<WebElement>links=driver.findElements(By.className("a"));
	  System.out.println("the number of elements is "+ links.size());
	  
	  
		// total number of images
	List<WebElement>images=driver.findElements(By.className("img"));
	  System.out.println("the number of elements is "+ images.size());
	  
	  
	  //click on any element
	  driver.findElement(By.partialLinkText("Phones")).click();
	  
	  
		
		
		
	}

}
