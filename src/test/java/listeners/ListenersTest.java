package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.CustomListerners.class)
public class ListenersTest {
    @Test
    void Test1(){
        System.out.println("This is Test1");
        Assert.assertEquals("A","A");
    }
    @Test
    void Test2(){
        System.out.println("This is Test2");
        Assert.assertEquals("A","A");
    }
    @Test
    void Test3(){
        System.out.println("This is Test3");
        //throw  new SkipException("this is skipped Exception");

    }
}
