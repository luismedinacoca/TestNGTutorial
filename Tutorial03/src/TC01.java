import org.testng.annotations.*;

public class TC01 {

    @BeforeSuite
    void beforeSuite(){
        System.out.println("                 ============");
        System.out.println("<<<<<<========== BEFORE SUITE ==========>>>>>>>");
        System.out.println("                 ============");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println(" ");
        System.out.println("                 ============");
        System.out.println("<<<<<<==========  AFTER SUITE ==========>>>>>>>");
        System.out.println("                 =============");
    }

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
    void method01(){
        System.out.println("                   This is method01");
    }

    @Test
    void method02(){
        System.out.println("                       This is method02");
    }
}