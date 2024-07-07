package Day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_dyanamic_tables {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.opencart.com/admin/index.php");
		
		WebElement username=driver.findElement(By.xpath("//input[@id=\"input-username\"]"));
		username.clear();
		username.sendKeys("demo");
	    WebElement paaswd=	driver.findElement(By.xpath("//input[@id=\"input-password\"]"));
	   paaswd.clear();
	   paaswd.sendKeys("demo");
	   driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]")).click();
	   
	   driver.findElement(By.xpath("//a[@class=\"parent collapsed\"][normalize-space()=\"Marketing\"]")).click();
	   driver.findElement(By.xpath("//ul[@id=\"collapse-6\"]//a[contains(text(),\"Marketing\")]")).click();
	   
	   

	}

}
