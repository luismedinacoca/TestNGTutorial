import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class _10_ParallelTest01 {

    WebDriver driver;

    @BeforeMethod
    void setup(){
        System.setProperty("webdriver.chrome.driver", "D:\\Programming\\[Selenium]\\CompleteSeleniumAutomationTutorial\\src\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @Test
    void logoTest()throws InterruptedException{
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed());
        Thread.sleep(5000);
    }

    @Test
    void homePageTitle() throws InterruptedException{
        Assert.assertEquals(driver.getTitle(), "OrangeHRM","Title is not found");
        Thread.sleep(5000);
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
