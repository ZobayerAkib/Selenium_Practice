
// Name: Md. Zobayer Ibna Kabir ; Date:26/6/24
package practiceThree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeThree {

	public static void main(String[] args) throws InterruptedException {
		
		//initialization
				WebDriverManager.chromedriver().setup();
				WebDriver driver= new ChromeDriver();
				//SiteNavigate
				driver.get("https://trytestingthis.netlify.app/");
				driver.manage().window().maximize();
				Thread.sleep(1000);
				
				//------------------------------*----------------------------------
				//Fill up the first name and last name
				driver.findElement(By.id("fname")).sendKeys("Md. Zobayer");
				Thread.sleep(1000);
				driver.findElement(By.id("lname")).sendKeys("Ibna Kabir");
				Thread.sleep(1000);
				
				//------------------------------*----------------------------------
				//Fill up the male radio button using Relative path
				WebElement radioButton= driver.findElement(By.xpath("//*[@id=\"male\"]")) ;
				radioButton.click();
				
				//Checking radio button is clicked perfectly or not
				 Assert.assertTrue(radioButton.isSelected(),"Radio button is not selected as expected");

	            // Print confirmation
	            System.out.println("Radio button is selected: " + radioButton.isSelected());
	            
	            //------------------------------*----------------------------------
	            //Check the Drop Down option using name locator
	            Select dropDownCheck = new Select(driver.findElement(By.name("option")));
	            
	            //Firstly, Choose option 2 
	            dropDownCheck.selectByVisibleText("Option 2");
	            Thread.sleep(1000);
	           //Lastly, Choose option 3 
	            dropDownCheck.selectByIndex(3);
	         
	           // Verify the selected option
	            String selectedOption = dropDownCheck.getFirstSelectedOption().getText();
	            Assert.assertEquals("Option 3", selectedOption, "Selected option is not as expected");
	            
	            // Print a confirmation message if assertion passes
	            System.out.println("Dropdown option selected successfully: " + selectedOption);
	            
	            Thread.sleep(1000);
	            
	            //------------------------------*----------------------------------
	            //Check the Multiple Option 
	            WebElement option1= driver.findElement(By.xpath("//*[@name=\"option1\"]"));
	            option1.click();
	            Thread.sleep(500);
	            WebElement option3= driver.findElement(By.name("option3"));
	            option3.click();
	            
	            // Verify the multiple selected option
;	            Assert.assertTrue(option1.isSelected(), "Option 1 is not clicked");
	            Assert.assertTrue(option3.isSelected(), "Option 3 is not clicked");

	            // Print a confirmation message if assertions pass
	            System.out.println("Clicked on Option 1 and Option 3 successfully!");
	            
	            Thread.sleep(1000);
	            
	           //------------------------------*----------------------------------
	            //Press submit button using absolute path
	            WebElement submitButton= driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/fieldset/button")) ;
	            submitButton.click();
	            
	           // Print a confirmation message if submission is successful
	            System.out.println("Clicked on Submit Button successfully!");
	            
	            System.out.println("All the test cases is passed, The Task is done Perfectly! ");
	            
	            
	            
				
		
		
	}
}
