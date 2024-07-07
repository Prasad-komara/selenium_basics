package Day9;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//normal alerts with OK button
		
		//driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		//after clicking we need to switch the window  to ignore the alerts
		/*
		 Thread.sleep(5000);
	    Alert myalert=driver.switchTo().alert();
	    System.out.println(myalert.getText());
	    myalert.accept();
		
		*/
		  
		
		//alert with confirmation OK and CANCEL button
		
		//driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(5000);
		
		//driver.switchTo().alert().accept();  // this close the window by using OK button
		
		 //driver.switchTo().alert().dismiss(); // this will close  the window by using cancel button
		
		
		//prompt-alerts
		 /*
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	     Alert myalert=	driver.switchTo().alert();
	     
	     myalert.sendKeys("welcome");
	     Thread.sleep(5000);
	     myalert.accept();  */
		
		
		//handling alerts without using switchto ().alert()  method  -using explict wait
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
	     Alert myalert=	mywait.until(ExpectedConditions.alertIsPresent());
	     myalert.sendKeys("welcome");
		System.out.println(myalert.getText());
		myalert.accept();
		
		
		
		
		
		
	}
	
	

}
