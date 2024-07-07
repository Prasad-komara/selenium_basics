package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/b/32702023031?node=32702023031&ld=AZINSOANavDesktop_T3&ref_=nav_cs_sell_T3");
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//using  xpath single attribute
		
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("slippers");
		
		//using multiple xpaths (we can specify mutiple atrributs)   with same elements
		//driver.findElement(By.xpath("input[@id='twotabsearchtextbox'][@name='twotabsearchtextbox']")).sendKeys("slippers");
		
		//xpath with AND operator
		
		//driver.findElement(By.xpath("input[@id='twotabsearchtextbox and @name='twotabsearchtextbox']")).sendKeys("slippers");
		
		//xpath with OR operator
		//driver.findElement(By.xpath("input[@id='twotabsearchtextbox OR @name='twotabsearchtextbox']")).sendKeys("slippers");
		
		
		
		//xpath with inner text  
		
		//driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		//boolean status=driver.findElement(By.xpath("//h3[text()='Featured']'")).isDisplayed();
		//System.out.println(status);
		
		
	//	String value=driver.findElement(By.xpath("//*[text()='Featured']'")).getText();
	// System.out.println(value);
		
		//xpath with contains
		//driver.findElement(By.xpath(" // input[contains(@placeholder,\"Sea\")] ")).sendKeys("tshirts");
		
		//xpath with starts-with()
		//driver.findElement(By.xpath(" //*input[starts-with(@placeholder,\"Sea\")] ")).sendKeys("tshirts");
		
		
		//chained xpath
		// boolean status=driver.findElement(By.xpath(" /*[@id='logo']/a/img")).isDisplayed();
		// System.out.println(status);
		
		
		
		
		
		
	}

}
