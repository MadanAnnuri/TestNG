package parlleltesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class parlleltest1 {
    WebDriver driver;

    @Test(priority = 1)
    void logotest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/login");
        WebElement logo=driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
        Assert.assertTrue(logo.isDisplayed(),"logo is not displayed");
        //Assert.assertFalse(logo.isDisplayed(),"logo is displayed");
        Thread.sleep(3000);
        driver.close();
    }

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



}
