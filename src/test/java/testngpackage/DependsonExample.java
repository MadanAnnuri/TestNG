package testngpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonExample {
    @Test
    void startCar(){
        System.out.println("car started");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"startCar"})
    void  driveCar(){
        System.out.println("driving car");
    }
    @Test(dependsOnMethods = {"driveCar"})
    void stopCar(){
        System.out.println("stop car");
    }
    @Test(dependsOnMethods = {"stopCar","driveCar"},alwaysRun = true)
    void parkCar(){
        System.out.println("parking Car");
    }
}
