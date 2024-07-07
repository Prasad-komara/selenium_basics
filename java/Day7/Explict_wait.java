package Day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explict_wait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//username
		
	WebElement usertext=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	usertext.sendKeys("Admin");
	
	
	//userpaaswd
	WebElement passwd=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
	
	
		passwd.sendKeys("admin123");
		//passwd.submit();
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("pasad");
		
		
		//submit
		WebElement submitbutton=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		submitbutton.click();		
	}

}
