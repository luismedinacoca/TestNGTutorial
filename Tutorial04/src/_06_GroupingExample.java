import org.testng.annotations.Test;

public class _06_GroupingExample {

    @Test(groups={"sanity"})
    void method01(){
        System.out.println("This is method 01");
    }

    @Test(groups={"sanity"})
    void method02(){
        System.out.println("This is method 02");
    }

    @Test(groups={"regression"})
    void method03(){
        System.out.println("This is method 03");
    }

    @Test(groups={"regression"})
    void method04(){
        System.out.println("This is method 04");
    }

    @Test(groups={"sanity", "regression"})
    void method05(){
        System.out.println("This is method 05");
    }
}
