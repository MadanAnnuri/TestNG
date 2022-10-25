package testngpackage;

import org.testng.annotations.Test;

public class GroupsExample
{

    @Test(groups = {"sanity"})
    void test0(){
        System.out.println("test0");
    }
    @Test(groups = {"sanity"})
    void test1(){
        System.out.println("test1");
    }
    @Test(groups = {"regression"})
    void test2(){
        System.out.println("test2");
    }
    @Test(groups = {"regression"})
    void test3(){
        System.out.println("test3");
    }
    @Test(groups = {"sanity","regression"})
    void test4(){
        System.out.println("test4");
    }
    @Test(groups = {"smoke"})
    void test5(){
        System.out.println("test5");
    }
}
