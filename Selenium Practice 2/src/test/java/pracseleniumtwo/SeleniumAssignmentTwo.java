// Name: Md. Zobayer Ibna Kabir ; Date:24/6/24
package pracseleniumtwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignmentTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//initialization
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//SiteNavigate
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30000));
			
		 // Print the title of the page
	        System.out.println("Page title is: " + driver.getTitle());
	        
	     //login check
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();
	        Thread.sleep(3000);
	        
	        //Assignmen-2--> Click the orange "t-shirt link" then click the "Add to Cart Button" then click the "Shopping cart badge" then click the "Continue-shopping button". Complete two tasks using relative paths and two tasks using absolute paths out of a total of four tasks.
	        
	        //Click the orange "t-shirt link" using Absolute Path.
	        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[6]/div[2]/div[1]/a/div")).click();
	        
	        Thread.sleep(3000);
	        
	        //click the "Add to Cart Button" using Relative Path.
	        driver.findElement(By.xpath("//*[@id=\"add-to-cart\"]")).click();
	        
	        Thread.sleep(3000);
	       
	        //click the "Shopping cart badge" using Absolute Path.
	        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
	        
	        Thread.sleep(3000);
	        
	        //click the "Continue-shopping button" using Relative Path
	        driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).click();
	        
	        System.out.println(" Successfully Checked! ");

       
    }
	
        
	}