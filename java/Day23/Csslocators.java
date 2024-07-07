package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csslocators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("small-searchterms")).sendKeys("Electronics");
		
		//by css selector // tag id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("t-shirts"); // here tag -input os optional but #is compel
		
		// tag name
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("t-shirts");
		
		
		//tag attribute
		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("T-Shirts");

		
		//tag attribute name
		driver.findElement(By.cssSelector("input.placeholder[name=\"q\"]")).sendKeys("t-shirts"); 
		
		
		
		
	}

}
