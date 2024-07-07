package Day8;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigational_methods {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		
		//navigate().to(url)---used to go to webpage  like get method
		
		//driver.navigate().to("https://demo.nopcommerce.com/");
		//URL myurl=new URL("https://demo.nopcommerce.com/");  // creation of url object
		
		//driver.navigate().to(myurl);
		
		driver.navigate().to("https://demo.nopcommerce.com/");
	    driver.navigate().to("//opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    //navigate().back()
	    
	    driver.navigate().back();
	   System.out.println( driver.getCurrentUrl());
	   
	   
	   //navigate().forward()
	   
	   driver.navigate().forward();
	   System.out.println( driver.getCurrentUrl());
	   
	   
	   //navigate().refresh()
		
	   driver.navigate().refresh();
		
		
		
		
		

	}

}
