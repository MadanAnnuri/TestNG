package testngpackage;

import org.testng.annotations.Test;

public class FirstTestClass {
    @Test(priority = 70)
    void startApp(){
        System.out.println("start application");
    }
    @Test(priority = 101)
    void login(){
        System.out.println("login to the webpage");
    }
    @Test(priority = 299)
    void closeApp(){
        System.out.println("close the application");
    }
}
