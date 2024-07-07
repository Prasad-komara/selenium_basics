package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalmethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fcomputers");
		
	//is displayed method()
		
	    //boolean status=	driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println(status);
		
		
		// isenabled method()
	//boolean	 status=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
	//System.out.println(status);
		
		//isselected method
		
	WebElement element1	 =driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement element2= driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
	System.out.println(" before selecting....");
	System.out.println(element1.isSelected());
	System.out.println(element2.isSelected());
	
	element1.click();
	element2.click();
	System.out.println(" After selecting....");
	System.out.println(element1.isSelected());  // it will return false becaze in radio button we can select only one button
	System.out.println(element2.isSelected());
	
	

		
		
		

	}

}
