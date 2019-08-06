import org.testng.annotations.*;

public class TC03 {

    @BeforeTest
    void beforeTest(){
        System.out.println("           *********************************");
        System.out.println("           * This will execute before Test *");
        System.out.println(" ");
    }

    @AfterTest
    void afterTest(){
        //System.out.println("           ********************************");
        System.out.println("           * This will execute after Test *");
        System.out.println("           ********************************");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("             This will execute before class");
        System.out.println("             ==============================");
    }

    @AfterClass
    void afterClass(){
        System.out.println("             This will execute after each class.....");
        System.out.println(" ");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("<<<<<<<<< This will execute before every method >>>>>>>>");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("  ****** This will execute after every method *******");
        System.out.println(" ");
    }

    @Test
    void method05(){
        System.out.println("                      This is method05");
    }

    @Test
    void method06(){
        System.out.println("                       This is method06");
    }
}
