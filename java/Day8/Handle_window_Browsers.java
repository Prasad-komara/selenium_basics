package Day8;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_window_Browsers {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> setids=driver.getWindowHandles(); // this is in set format we need to  extract
		  
		/*
		// extraction approcah1
		List<String> listids=new ArrayList(setids);
	    String id1=	listids.get(0);
	   String id2=	listids.get(1);
	   System.out.println(id1);    //3EC2357E8FAA0E9F3DB33E18B4EC6A58   //OrangeHRM
	   System.out.println(id2);    //9DB654BE98629E57FF44465FF2C55289
	   
	   System.out.println(driver.getTitle());
		
		
	   
	   //switch to id2 window
	   driver.switchTo().window(id2);
	   
	  System.out.println(driver.getTitle());
	  
	  //switch to id1 window
	  
	  driver.switchTo().window(id1);
	  System.out.println(driver.getTitle());
	  
	  */
	  
		//approch2 ---if we are having multiple windows
		 for(String windowid:setids)
		 {
			String title= driver.switchTo().window(windowid).getTitle();
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		 }
		

	}

}
