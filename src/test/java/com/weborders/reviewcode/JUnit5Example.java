package com.weborders.reviewcode;

import org.junit.jupiter.api.*;
// if i don't want to make beforeAll and afterAll static -- only for JUnit5, not jUnit4
//i add the lne below to - above the class
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JUnit5Example {


    @BeforeAll  //just like the before class
    public void beforeAll(){
        System.out.println("Before Class");
    }

    @AfterAll
    public void afterAll(){   //like afterCLass
        System.out.println("After Class");
    }

    @BeforeEach  //like before and beforeMethod
    public void before(){
        System.out.println("Before method");
    }

    @AfterEach   //like after and afterMethod
    public void after(){
        System.out.println("After method");
    }

    @Test
    public void test1(){
//imported from jupiter.api
        System.out.println("test 1");
        Assertions.assertEquals(1,1);
    }
@Test
    public void test2(){
    System.out.println("test 2");
    Assertions.assertTrue(true);
}






}
