package ListenersPackage;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ListenerTest02 {
    @Test
    void test01(){
        System.out.println("this is Test01");
        Assert.assertEquals("A", "A");
    }

    @Test
    void test02(){
        System.out.println("this is Test02");
        Assert.assertEquals("A", "B");
    }

    @Test
    void test03(){
        System.out.println("this is Test03");
        throw new SkipException("Thisi is skip exception....");
    }
}
