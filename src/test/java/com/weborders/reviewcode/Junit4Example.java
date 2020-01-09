package com.weborders.reviewcode;
import org.junit.*;

public class Junit4Example {

    @BeforeClass   //java.lang.Exception: Method beforeClass() should be static!!
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @Before //is like BeforeMethod from testNG
    public void before(){
        System.out.println("This is before method Junit");
    }
        @After
        public void afterTest(){
            System.out.println("This is After Method");
        }

    @Test
    public void test1(){
    System.out.println("test1");
    Assert.assertTrue(true);   //Assertion from Junit
    }

    @Test
    public void test2(){
        System.out.println("test 2");
        Assert.assertEquals(true, true );
    }

//in junit 4 - for DDT - i dont have to write two seperate methods to provide data and then run it....
    // i can directly point to the csv file    -   data.csv
}
