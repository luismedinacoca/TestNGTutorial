import jdk.swing.interop.SwingInterOpUtils;
import org.testng.annotations.*;

public class TC02 {

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
    void method03(){
        System.out.println("                      This is method03");
    }

    @Test
    void method04(){
        System.out.println("                       This is method04");
    }
}
