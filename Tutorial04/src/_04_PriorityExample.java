import org.testng.annotations.Test;

public class _04_PriorityExample {

    @Test(priority=0)
    void methodOne(){
        System.out.println("This is method ONE");
    }

    @Test(priority=1)
    void methodTwo(){
        System.out.println("This is method TWO");
    }

    @Test(priority=2,enabled=false)
    void methodThree(){
        System.out.println("This is method THREE");
    }

    @Test(priority=3)
    void methodFour(){
        System.out.println("This is method FOUR");
    }
}