package Day8;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closing_specific_browser_window {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> setids=driver.getWindowHandles();
		
		
		for(String windowids:setids)
		{
		String title=	driver.switchTo().window(windowids).getTitle();
		
		
		if(title.equals("OrangeHRM"))
		{
			driver.close();
		}
		
		}

	}

}
