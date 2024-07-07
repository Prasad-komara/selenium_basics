package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdowns {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// to login
		driver.findElement(By.name("Username")).sendKeys("Admin");   
		driver.findElement(By.name("Password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		/*
		
		// to click on the --PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		//  click on the dropdown button
		  driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		  
		  
		  // to select the hidden suggestions
		  driver.findElement(By.xpath("//div[contains(text(),'Account Assistant')]")).click();
		  
		
		*/
		

		

	}

}
