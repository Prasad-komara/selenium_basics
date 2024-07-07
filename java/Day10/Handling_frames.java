package Day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;   //frame[@src='frame_2.html']

public class Handling_frames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']")); // switching into the frame
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("welcome");
		
		driver.switchTo().defaultContent();
		
		
		//here we can switchto another frame         
		                                               //frame address
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_1.html']")); // switching into the frame
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("welcome");
		

	}
}


