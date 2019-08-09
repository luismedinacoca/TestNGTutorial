import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _07_AssertionsExample {

    WebDriver driver;
    @BeforeClass
    void setup(){
        System.setProperty("webdriver.chrome.driver","D:\\Programming\\[Selenium]\\CompleteSeleniumAutomationTutorial\\src\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
    }

    @Test(priority = 1)
    void logoTest() throws InterruptedException{
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on page");
        Thread.sleep(5000);
    }


    @Test(priority = 2)
    void homePageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "OrangeHRM", "Title is not matched");
        //Assert.assertEquals(Expected, Actual, Message in case they are not equals);
    }


    @AfterClass
    void tearDown(){
        driver.close();
    }
}