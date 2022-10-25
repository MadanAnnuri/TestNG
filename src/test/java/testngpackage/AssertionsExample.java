package testngpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssertionsExample {
    WebDriver driver;
    @BeforeClass
    void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test(priority = 1)
    void logoTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement logo= driver. findElement(By.xpath("//img[@alt='company-branding']"));
      //  Assert.assertTrue(logo.isDisplayed(),"logo not displayed");
        Assert.assertFalse(logo.isDisplayed(),"logo is displayed");
        Thread.sleep(5000);
    }
    @Test(priority = 2)
    void titleTest(){
        String title=driver.getTitle();
        Assert.assertEquals(title,"OrangeHRM","title message not matched");
    }

    @AfterClass
    void tearDown(){
        driver.close();
    }
}
