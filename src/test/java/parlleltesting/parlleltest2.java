package parlleltesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class parlleltest2 {
    WebDriver driver;

    @Test(priority = 1)
    void logintest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String ActualTitle=driver.getTitle();
        Assert.assertEquals(ActualTitle,"OrangeHRM");
        driver.close();

    }
    /*@AfterMethod
    void closeapp(){
        this.driver.quit();
    }*/

/*
    @Test(priority = 2)
    void homePageTitle() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/login");

        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,"Demo Web Shop. Login");
        Thread.sleep(3000);
        driver.close();
    }
*/



}
