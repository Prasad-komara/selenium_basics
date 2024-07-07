package Day15;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_datepickers {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/datepicker/");
		
		//swith to the frame
		driver.switchTo().frame(0);
	// send the date --- method1
		// driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/12/2002");
		 
		 //method2 -using date pickers
		
		 //expected date
		 String month="May";
		 String date="10";
		 String year="2027";
		 
		 //
		 driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		   //select month and year
		 
		 while(true)
		 {
			String currentmonth= driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String cuurentyear= driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
			
			if(currentmonth.equals(month)  && cuurentyear.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();//next
			//driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();//previous
			
		 }  
		 
		  //select date
		 
		 List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr//td//a")); // all dates
		 
		 for(WebElement dt:alldates)
		 {
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
					
		 }
		
		 
		 
		 
		 

	}

}
