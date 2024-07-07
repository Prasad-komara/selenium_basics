package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Simpletest {

	public static void main(String[] args) {
		
		//launch a chrome browser
		
		//ChromeDriver chrome=new ChromeDriver();  this is also posible but the below is best approach
		WebDriver driver=new ChromeDriver();
		
		// open the url of the web application
		driver.get("https://demo.opencart.com/");
		
		//validate the title is coorect or not (" your store")
		String actual_title=driver.getTitle();  // this method automatically take the title of the web page
		
		if(actual_title.equals("Your Store"))
		{
		
			System.out.println("test sucess ");
		}
		else
		{
		System.out.println(" test fail");
		}
		
		//driver.close();  // two approches
		driver.quit();
		

		
		
		
	}

}
