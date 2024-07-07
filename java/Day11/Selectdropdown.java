package Day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://testautomationpractice.blogspot.com/");
	   WebElement drpelement=	driver.findElement(By.xpath("//select[@id='country']"));

	   Select drpcountry=new Select(drpelement);
	   
	   //select the options in dropbox ---3 ways
	           // drpcountry.selectByVisibleText("United States");
	             //drpcountry.selectByValue("germany");
	            // drpcountry.selectByIndex(4);
	  
	   //total count of drop down
       //List<WebElement>	count=drpcountry.getOptions();
	   // System.out.println(count.size());
	   
	   //print all the dropdown
	   /*
	   List<WebElement>	count=drpcountry.getOptions();
	   for(int i=0;i<count.size();i++)
	   {
		   WebElement dropdown=count.get(i);
		   dropdown.getText();
		  System.out.println(dropdown.getText());
	   }
	   System.out.println(count.size());
	   
	   */ 
	   /*
	   List<WebElement>	count=drpcountry.getOptions();
	   for(WebElement op:count)
	   {
		  System.out.println(op.getText());
	   }  
	   */
	   
	   
	   
	   
	   
	}

}
