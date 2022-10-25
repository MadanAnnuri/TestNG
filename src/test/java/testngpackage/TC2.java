package testngpackage;

import org.testng.annotations.*;

public class TC2
{
    @BeforeSuite
    void beforeSuite(){
        System.out.println("beforeSuite");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("afterSuite");
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("before class method will be executed");
    }
    @AfterClass
    void afterClass(){
        System.out.println("after class method will be executed");
    }

    @BeforeMethod
   void beforeMethod(){
       System.out.println("it will execute before every method");
   }
   @AfterMethod
    void afterMethod(){
        System.out.println("it will execute after every method");
    }

    @Test
    void test3(){
        System.out.println("test3....");
    }
    @Test
    void test4(){
        System.out.println("test4....");
    }



}
