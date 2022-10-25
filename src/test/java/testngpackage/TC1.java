package testngpackage;

import org.testng.annotations.*;

public class TC1
{
    @BeforeTest
    void beforeTest(){
        System.out.println("before Test it will execute");
    }
    @AfterTest
    void afterTest(){
        System.out.println("after Test it will execute");
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
    void test1(){
        System.out.println("test1....");
    }
    @Test
    void test2(){
        System.out.println("test2....");
    }



}
