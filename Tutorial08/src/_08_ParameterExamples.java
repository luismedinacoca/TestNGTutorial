import com.beust.jcommander.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _08_ParameterExamples {

    WebDriver driver;
    @BeforeClass
    @Parameters({"browser", "url"})
    void setup(String browser, String app){
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","D:\\Programming\\[Selenium]\\CompleteSeleniumAutomationTutorial\\src\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","D:\\Programming\\[Selenium]\\CompleteSeleniumAutomationTutorial\\src\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get(app);
        //driver.get("https://opensource-demo.orangehrmlive.com");
    }

    @Test(priority = 1)
    void logoTest(){
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on page");
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
