package Day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_chect_boxes {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		////input[@cla sinput[@clas='form-check form-check-inline' and @type=type='checkbox']
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
         //	for specific check box
		     //driver.findElement(By.xpath("//input[@id=\"sunday\"]")).click();
		
		// for multiple check boxess
		 List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @ type='checkbox']"));
		
		// for loop -- to store the web elements
		
		 /*
		 for(int i=0;i<checkboxes.size();i++)
		 {
			 checkboxes.get(i).click();
		 }
		  */
		 
		 
		  /*
		 
		 for(WebElement checkbox :checkboxes)
		 {
			 checkbox.click();
			 
			 */
		 
		 
		 //select last 3 checkboxes---- formula= total checkboxes-last 3 check boxes= starting index  (7-3=4)
		   /*
		 for (int i=4;i<checkboxes.size();i++)
		 {
			 checkboxes.get(i).click();
		 
		 }
		*/  
		 
		 // first 3 check boxes
		   /*
		  for(int i=0;i<checkboxes.size()-4;i++)
		  {
			  checkboxes.get(i).click();
		  }
		 
		 */
		 
		 // unselect the selected checkboxes
		 
		  for(int i=0;i<3;i++)
		  {
			  checkboxes.get(i).click();
		  }
		  
		  
		  Thread.sleep(5000);

		  for(int i=0;i<3;i++)
		  {
			  if(checkboxes.get(i).isSelected())
			  {
				  checkboxes.get(i).click();
			  }
		  }
		  
		  driver.close();
		  
		 
		 
		 
		
		
	}

}
 