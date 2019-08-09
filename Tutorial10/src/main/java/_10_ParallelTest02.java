import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class _10_ParallelTest02 {

    WebDriver driver;

    @Test
    void login() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "D:\\Programming\\[Selenium]\\CompleteSeleniumAutomationTutorial\\src\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
        Thread.sleep(5000);
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
