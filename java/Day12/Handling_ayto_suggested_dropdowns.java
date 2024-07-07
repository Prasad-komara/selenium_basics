package Day12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_ayto_suggested_dropdowns {
	

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		
    List<WebElement>list=	driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
     System.out.println(list.size());
     
     
     
    for(int i=0;i<list.size();i++)
    {
    	System.out.println(  list.get(i).getText());
    	
    	if(list.get(i).getText().equals("selenium jar download"))
    	{
    		list.get(i).click();
    	}
    }
    
    
    
    
    
    
    
    
	}

}
