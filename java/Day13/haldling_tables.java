package Day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class haldling_tables {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 driver.get("https://testautomationpractice.blogspot.com/");
		  
		 //find the number of rows
	        int rows=	 driver.findElements(By.xpath("// table[@ name='BookTable']//tr")).size();
		    //System.out.println(rows); 
		
		//finnd the number of columns
		
		    int colmn=driver.findElements(By.xpath("// table[@ name='BookTable']//tr//th")).size();
	          //System.out.println(colmn);
	
		 //read data from specific row (ex: 5th row 1st colmn

	
	      // String element = 	 driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText();
	       //System.out.println(element);
		 
		 //read all the data from the table
		    
		    System.out.println("BookName"+"\t"+"Author"+"\t"+"subject"+"\t"+"price");
		 for(int r=2;r<rows;r++)
		 {
			 for(int c=1;c<colmn;c++)
			 {                                                             //here we cant pass variable directly into the xpath
				String values= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText(); 
				
				System.out.print(values+" \t ");
				 
				 
			 }
			 System.out.println();
		 }
		 
		
	
		
		
		
		
	}

}
