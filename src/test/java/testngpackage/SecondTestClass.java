package testngpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestClass {
    @Test(priority = 1)
    void startbrowser(){
        System.out.println("start application browser");
    }
    @Test(priority = 0)
    void addcustomer(){
        System.out.println("add customer to the webpage");
    }
    @Test(priority = 2)
    void closebrowser(){
        System.out.println("close the application browser");
        Assert.assertEquals(1,1);
    }
}
