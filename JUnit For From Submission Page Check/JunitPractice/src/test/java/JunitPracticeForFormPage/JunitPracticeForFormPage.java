package JunitPracticeForFormPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
public class JunitPracticeForFormPage {
public WebDriver driver;
    
    @BeforeAll
    public void init() {
    	//initialization
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //SiteNavigate
        driver.get("https://trytestingthis.netlify.app/");
        driver.manage().window().maximize();
        
    }
    
    //------------------------------*----------------------------------
	//Fill up the first name and last name
    @Test
    @Order(1)
    public void fillUpFirstnLastName() throws InterruptedException {
        driver.findElement(By.id("fname")).sendKeys("Md. Zobayer");
        Thread.sleep(1000);
        driver.findElement(By.id("lname")).sendKeys("Ibna Kabir");
        Thread.sleep(1000);
    }
    
    //------------------------------*----------------------------------
	//Fill up the male radio button using Relative path
    @Test
    @Order(2)
    public void checkRadioButton() throws InterruptedException {
        WebElement radioButton = driver.findElement(By.xpath("//*[@id=\"male\"]"));
        radioButton.click();
        Assert.assertTrue(radioButton.isSelected(), "Radio button is not selected as expected");
        System.out.println("Radio button is selected: " + radioButton.isSelected());
        Thread.sleep(1000);
    }
    //------------------------------*-------------
    //Check the Drop Down option using name locator
    @Test
    @Order(3)
    public void checkDropDown() throws InterruptedException {
        Select dropDownCheck = new Select(driver.findElement(By.name("option")));
        dropDownCheck.selectByVisibleText("Option 2");
        dropDownCheck.selectByIndex(3);
        String selectedOption = dropDownCheck.getFirstSelectedOption().getText();
        Assert.assertEquals("Option 3", selectedOption, "Selected option is not as expected");
        System.out.println("Dropdown option selected successfully: " + selectedOption);
        Thread.sleep(1000);
    }
    //------------------------------*----------------------------------
    //Check the Multiple Option
    @Test
    @Order(4)
    public void checkMultipleOptions() throws InterruptedException {
        WebElement option1 = driver.findElement(By.xpath("//*[@name=\"option1\"]"));
        option1.click();
        Thread.sleep(1000);
        WebElement option3 = driver.findElement(By.name("option3"));
        option3.click();
        Assert.assertTrue(option1.isSelected(), "Option 1 is not clicked");
        Assert.assertTrue(option3.isSelected(), "Option 3 is not clicked");
        System.out.println("Clicked on Option 1 and Option 3 successfully!");
        Thread.sleep(1000);
    }
    //------------------------------*----------------------------------
    //Press submit button using absolute path
    @Test
    @Order(5)
    public void submitForm() {
        WebElement submitButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/fieldset/button"));
        submitButton.click();
        System.out.println("Clicked on Submit Button successfully!");
        System.out.println("Form submission was successful!");
    }
}
