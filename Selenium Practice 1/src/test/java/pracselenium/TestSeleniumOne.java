// Name: Md. Zobayer Ibna Kabir ; Date:24/6/24
package pracselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestSeleniumOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//initialization
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		//SiteNavigate
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
			
		 // Print the title of the page
	        System.out.println("Page title is: " + driver.getTitle());
	        
	     //login check
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();
	        
	        Thread.sleep(2000);

         // Get the title of the page
            String pageTitle = driver.getTitle();

         // Expected title
            String expectedTitle = "Swag Labs";

         // Assert that the actual title matches the expected title
            
             Assert.assertEquals(expectedTitle, pageTitle);

         // Print a success message if the assertion passes
             
            System.out.println("Title check passed!");
            
            
         // Assert that the actual URL matches the expected URL(Assignment ---> 1)
            
            String expectedUrl="https://www.saucedemo.com/inventory.html";
            
            String realUrl=driver.getCurrentUrl();
            
            Assert.assertEquals(expectedUrl,realUrl);
            
         // Print a success message if the assertion passes
            System.out.println("Url check passed!");
           
            

       
    }
	
        
	}


