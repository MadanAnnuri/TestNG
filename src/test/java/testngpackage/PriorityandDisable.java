package testngpackage;

import org.testng.annotations.Test;

public class PriorityandDisable {
    @Test(priority = 0)
    void testone(){
        System.out.println("test 1");
    }
    @Test(priority = 10)
    void testtwo(){
        System.out.println("test 2");
    }
    @Test(priority = 25)
    void testthree(){
        System.out.println("test 3");
    }
    @Test(priority = 100,enabled = false)
    void testfour(){
        System.out.println("test 4");
    }



}
