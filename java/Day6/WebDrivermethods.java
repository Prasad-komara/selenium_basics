package Day6;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivermethods {

	public static void main(String[] args) throws InterruptedException {
		// get methods
		
		WebDriver driver =new ChromeDriver();
		 
		
	// get(url)
		
		driver.get("https://www.orangehrm.com/");
		Thread.sleep(5000);
		
	//gettitle()
		//String s=driver.getTitle().
		//System.out.println(s);
		
	//getcurrenturl
		//String s=driver.getCurrentUrl();
		//System.out.println(s);
		
		
     //getpagesource- it return the  source code in the understandable format
		//String s=driver.getPageSource();
		//System.out.println(s);
		
		//getwindowHandle ---it will return string
		//String id= driver.getWindowHandle();
		
		//System.out.println(id);
		
		
		driver.findElement(By.linkText("OrangeHRM Inc")).click();
		
		
		//getwindowhandles--- it will return string of set collection
		
	 // Set<String> ids=driver.getWindowHandles();
	 // System.out.println(ids);
		
		
		
		
		
		
	}

}
