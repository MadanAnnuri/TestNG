package testngpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ParameterExample {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser,String app){
        if(browser.equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("edge")){
            //WebDriverManager.firefoxdriver().setup();
            System.setProperty("webdriver.edge.driver", "C:\\Users\\Madan Annuri\\Downloads\\edgedriver_win64");//need to be updated
            driver =new EdgeDriver();
        }
        driver.get(app);
    }
    @Test(priority = 1)
    void logoTest(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement logo= driver. findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(logo.isDisplayed(),"logo not displayed");
        //Assert.assertFalse(logo.isDisplayed(),"logo is displayed");
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
