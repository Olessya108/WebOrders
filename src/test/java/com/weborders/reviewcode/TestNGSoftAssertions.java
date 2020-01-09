package com.weborders.reviewcode;

import org.junit.AfterClass;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGSoftAssertions {

    //softAssert comes from testNG
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void test() {
        Assert.assertEquals(2, 1);//if assertion fails, everyth stops,
        //will not print hello
        System.out.println("Hello");
    }



    @AfterClass
    public void afterClass(){

        softAssert.assertAll();  //at the end of the class, for all the tests
    }

        @Test
        public void test1() {
        //if test fails, soft assertion will not stop all tests, it will continue executing
        //collects error but doesn't throw exception
            //soft assertion - is for lowpriority tests
            softAssert.assertEquals(1, 1); //makes assertion but doesnt report
            System.out.println("hi");

            softAssert.assertAll(); // this line is at the end of all tests, it will report all tests-at the end

        }

@Test
    public void test2(){

    System.out.println("test2");
    softAssert.assertEquals(1,1);
    softAssert.assertTrue(false);





}





}
