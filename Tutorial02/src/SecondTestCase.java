/*  Configuration
    Select Project --> Run Menu --> Edit Configuration
    click on "testng.xml address"
    select "Listeners"
    click on "+"
    add REPORTERS and FAILEDREPORTER
    Apply and ok

    test-output folder is created.
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority=1)
    void setup(){
        System.out.println("Opening browser");
    }

    @Test(priority=3)
    void searchCustomer(){
        System.out.println("This is Search Customer test");
        Assert.assertEquals(1, 1);
    }

    @Test(priority=2)
    void addCustomer(){
        System.out.println("This is Add Customer test");
    }

    @Test(priority=4)
    void teardown(){
        System.out.println("closing browser");
    }
}
